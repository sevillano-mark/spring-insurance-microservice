package com.sevillanomark.policymgmtsystem.policyservice.repositories;

import com.sevillanomark.policymgmtsystem.policyservice.models.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, BigInteger> {
    List<Policy> findByOwner(BigInteger owner);

    List<Policy> findByPolicyNumber(String policyNumber);
}
