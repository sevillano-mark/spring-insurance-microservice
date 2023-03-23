package com.sevillanomark.policymgmtsystem.userservice.dtos;

import java.math.BigInteger;

public class UserDto {

    private String email;

    private String firstName;

    private String lastName;

    private BigInteger userType;

    public UserDto() {
    }

    public UserDto(String email, String firstName, String lastName, BigInteger userType) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigInteger getUserType() {
        return userType;
    }

    public void setUserType(BigInteger userType) {
        this.userType = userType;
    }
}
