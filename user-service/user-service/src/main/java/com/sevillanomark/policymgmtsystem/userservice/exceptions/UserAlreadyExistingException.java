package com.sevillanomark.policymgmtsystem.userservice.exceptions;

import java.math.BigInteger;

public class UserAlreadyExistingException extends RuntimeException {
    public UserAlreadyExistingException(String email) {
        super(String.format("User with email: %s is already existing.", email));
    }
}
