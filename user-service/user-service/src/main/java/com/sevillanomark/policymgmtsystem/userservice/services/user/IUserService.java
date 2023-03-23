package com.sevillanomark.policymgmtsystem.userservice.services.user;

import com.sevillanomark.policymgmtsystem.userservice.dtos.UserDto;
import com.sevillanomark.policymgmtsystem.userservice.models.User;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> findAllUsers();
    User findUserById(BigInteger id);
    User addUser(UserDto newUser);
    List<User> searchUserByName(String criteria);

}
