package com.sevillanomark.policymgmtsystem.userservice.repositories;

import com.sevillanomark.policymgmtsystem.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface UserRepository extends JpaRepository<User, BigInteger> {
    List<User> findByFirstNameContaining(String infix);
    List<User> findByLastNameContaining(String infix);

    List<User> findByEmail(String email);
}
