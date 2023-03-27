package com.sevillanomark.policymgmtsystem.policyservice.services.user;

import com.sevillanomark.policymgmtsystem.policyservice.dtos.UserDto;
import com.sevillanomark.policymgmtsystem.policyservice.models.User;

import java.math.BigInteger;

public interface IUserService {
    User findUserById(BigInteger id);
    User addUser(UserDto newUser);

    Boolean isUserExistById(BigInteger id);
}
