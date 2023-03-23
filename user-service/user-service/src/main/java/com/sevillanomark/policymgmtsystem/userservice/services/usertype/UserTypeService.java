package com.sevillanomark.policymgmtsystem.userservice.services.usertype;

import com.sevillanomark.policymgmtsystem.userservice.models.User;
import com.sevillanomark.policymgmtsystem.userservice.models.UserType;
import com.sevillanomark.policymgmtsystem.userservice.repositories.UserTypeRepository;
import com.sevillanomark.policymgmtsystem.userservice.services.user.IUserService;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class UserTypeService implements IUserTypeService {
    private UserTypeRepository userTypeRepository;
    @Override
    public List<UserType> findAllUserTypes() {
        return userTypeRepository.findAll();
    }
}
