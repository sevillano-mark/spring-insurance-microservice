package com.sevillanomark.policymgmtsystem.policyservice.repositories;

import com.sevillanomark.policymgmtsystem.policyservice.models.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface PolicyRepository extends JpaRepository<Policy, BigInteger> {
    List<Policy> findByOwner(BigInteger owner);

    List<Policy> findByPolicyNumber(String policyNumber);
}
