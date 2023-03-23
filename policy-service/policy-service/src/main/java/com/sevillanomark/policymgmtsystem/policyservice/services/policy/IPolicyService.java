package com.sevillanomark.policymgmtsystem.policyservice.services.policy;

import com.sevillanomark.policymgmtsystem.policyservice.models.Policy;

import java.math.BigInteger;
import java.util.List;

public interface IPolicyService {

    List<Policy> fetchAllPolicies();
    List<Policy> fetchAllPoliciesFromUser(BigInteger userId);
    Policy fetchPolicyById(BigInteger id);

    Policy savePolicy(BigInteger id);
}
