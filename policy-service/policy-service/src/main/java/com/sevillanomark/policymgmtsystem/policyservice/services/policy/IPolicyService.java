package com.sevillanomark.policymgmtsystem.policyservice.services.policy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sevillanomark.policymgmtsystem.policyservice.dtos.PolicyDto;
import com.sevillanomark.policymgmtsystem.policyservice.models.Policy;

import java.math.BigInteger;
import java.util.List;

public interface IPolicyService {

    List<Policy> fetchAllPolicies();
    List<Policy> fetchAllPoliciesFromUser(BigInteger userId);
    Policy fetchPolicyById(BigInteger id);

    Policy savePolicy(PolicyDto policyDto) throws JsonProcessingException;
}
