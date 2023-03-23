package com.sevillanomark.policymgmtsystem.userservice.services.user;

import com.sevillanomark.policymgmtsystem.userservice.dtos.UserDto;
import com.sevillanomark.policymgmtsystem.userservice.exceptions.UserAlreadyExistingException;
import com.sevillanomark.policymgmtsystem.userservice.exceptions.UserNotFoundException;
import com.sevillanomark.policymgmtsystem.userservice.models.User;
import com.sevillanomark.policymgmtsystem.userservice.models.UserType;
import com.sevillanomark.policymgmtsystem.userservice.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(BigInteger id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public User addUser(UserDto newUser) {
        String email = newUser.getEmail();
        List<User> userWithEmail = userRepository.findByEmail(email);

        if (userWithEmail.size() != 0) {
            throw new UserAlreadyExistingException(email);
        }
        User user = modelMapper.map(newUser, User.class);
        UserType userType = entityManager.getReference(UserType.class, newUser.getUserType());
        if (userType == null) {
            throw new UserAlreadyExistingException(newUser.getUserType().toString());
        }
        user.setUserType(userType);
        return userRepository.save(user);
    }

    @Override
    public List<User> searchUserByName(String criteria) {
        List<User> users = userRepository.findByFirstNameContaining(criteria);
        List<User> result =  userRepository.findByLastNameContaining(criteria);
        result.addAll(users);
        return result;
    }
}
