package com.sevillanomark.policymgmtsystem.policyservice.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sevillanomark.policymgmtsystem.policyservice.dtos.PolicyDto;
import com.sevillanomark.policymgmtsystem.policyservice.models.Policy;
import com.sevillanomark.policymgmtsystem.policyservice.services.policy.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/policy")
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<List<Policy>> retrieveAllPolicyFromUser(
            @PathVariable BigInteger ownerId
    ) {
        return ResponseEntity.ok(policyService.fetchAllPoliciesFromUser(ownerId));
    }

    @PostMapping
    public ResponseEntity<Policy> createPolicy(
            @RequestBody PolicyDto policyDto
    ) throws JsonProcessingException {
        return ResponseEntity.ok(policyService.savePolicy(policyDto));
    }

}
