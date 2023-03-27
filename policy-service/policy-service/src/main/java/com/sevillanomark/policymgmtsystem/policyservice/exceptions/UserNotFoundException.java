package com.sevillanomark.policymgmtsystem.policyservice.exceptions;

import java.math.BigInteger;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(BigInteger id) {
        super(String.format("User with ID: %d is not found.", id));
    }
}
