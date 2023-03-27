package com.sevillanomark.policymgmtsystem.policyservice.services.user;

import com.sevillanomark.policymgmtsystem.policyservice.dtos.UserDto;
import com.sevillanomark.policymgmtsystem.policyservice.exceptions.UserNotFoundException;
import com.sevillanomark.policymgmtsystem.policyservice.models.User;
import com.sevillanomark.policymgmtsystem.policyservice.proxies.UserServiceProxy;
import com.sevillanomark.policymgmtsystem.policyservice.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User findUserById(BigInteger id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User addUser(UserDto newUser) {
        User user = modelMapper.map(newUser, User.class);
        return userRepository.save(user);
    }

    @Override
    public Boolean isUserExistById(BigInteger id) {
        return userRepository.existsById(id);
    }
}
