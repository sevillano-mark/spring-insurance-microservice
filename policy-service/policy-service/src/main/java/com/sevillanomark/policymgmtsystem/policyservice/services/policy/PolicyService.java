package com.sevillanomark.policymgmtsystem.policyservice.services.policy;

import com.sevillanomark.policymgmtsystem.policyservice.models.Policy;
import com.sevillanomark.policymgmtsystem.policyservice.repositories.PolicyRepository;
import com.sevillanomark.policymgmtsystem.policyservice.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class PolicyService implements IPolicyService{
    @Autowired
    private PolicyRepository policyRepository;
    @Autowired
    private UserRepository userRepository;
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<Policy> fetchAllPolicies() {
        return null;
    }

    @Override
    public List<Policy> fetchAllPoliciesFromUser(BigInteger userId) {
        return policyRepository.findByOwner(userId);
    }

    @Override
    public Policy fetchPolicyById(BigInteger id) {
        return null;
    }

    @Override
    public Policy savePolicy(BigInteger id) {
        return null;
    }
}
