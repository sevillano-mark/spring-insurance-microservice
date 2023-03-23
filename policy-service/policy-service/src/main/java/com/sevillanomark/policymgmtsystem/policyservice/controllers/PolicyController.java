package com.sevillanomark.policymgmtsystem.policyservice.controllers;

import com.sevillanomark.policymgmtsystem.policyservice.models.Policy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("policy")
public class PolicyController {
    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<List<Policy>> retrieveAllPolicyFromUser(
            @PathVariable BigInteger ownerId
    ) {

    }


}
