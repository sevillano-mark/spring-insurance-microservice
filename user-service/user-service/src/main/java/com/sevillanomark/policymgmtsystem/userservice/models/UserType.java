package com.sevillanomark.policymgmtsystem.userservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigInteger;

@Entity
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger userTypeId;

    private String userType;

    private String description;


    public UserType() {
    }

    public UserType(BigInteger userTypeId, String userType, String description) {
        this.userTypeId = userTypeId;
        this.userType = userType;
        this.description = description;
    }

    public BigInteger getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(BigInteger userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
