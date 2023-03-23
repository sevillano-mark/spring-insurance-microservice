package com.sevillanomark.policymgmtsystem.userservice.services.usertype;

import com.sevillanomark.policymgmtsystem.userservice.models.UserType;

import java.math.BigInteger;
import java.util.List;

public interface IUserTypeService {

    List<UserType> findAllUserTypes();
}
