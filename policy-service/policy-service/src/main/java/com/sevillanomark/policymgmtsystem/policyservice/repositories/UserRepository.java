package com.sevillanomark.policymgmtsystem.policyservice.repositories;

import com.sevillanomark.policymgmtsystem.policyservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserRepository extends JpaRepository<User, BigInteger> {

}
