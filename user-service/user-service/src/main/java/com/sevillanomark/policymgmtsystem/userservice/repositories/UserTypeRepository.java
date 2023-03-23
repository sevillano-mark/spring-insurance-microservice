package com.sevillanomark.policymgmtsystem.userservice.repositories;

import com.sevillanomark.policymgmtsystem.userservice.models.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserTypeRepository extends JpaRepository<UserType, BigInteger> {
}
