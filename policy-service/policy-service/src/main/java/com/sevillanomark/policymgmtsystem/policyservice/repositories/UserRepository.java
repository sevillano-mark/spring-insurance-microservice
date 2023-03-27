package com.sevillanomark.policymgmtsystem.policyservice.repositories;

import com.sevillanomark.policymgmtsystem.policyservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface UserRepository extends JpaRepository<User, BigInteger> {

}
