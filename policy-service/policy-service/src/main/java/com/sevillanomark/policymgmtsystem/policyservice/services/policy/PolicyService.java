package com.sevillanomark.policymgmtsystem.policyservice.services.policy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.sevillanomark.policymgmtsystem.policyservice.dtos.PolicyDto;
import com.sevillanomark.policymgmtsystem.policyservice.dtos.UserDto;
import com.sevillanomark.policymgmtsystem.policyservice.models.Policy;
import com.sevillanomark.policymgmtsystem.policyservice.models.User;
import com.sevillanomark.policymgmtsystem.policyservice.proxies.UserServiceProxy;
import com.sevillanomark.policymgmtsystem.policyservice.repositories.PolicyRepository;
import com.sevillanomark.policymgmtsystem.policyservice.repositories.UserRepository;
import com.sevillanomark.policymgmtsystem.policyservice.services.user.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
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
    private UserService userService;
    @Autowired
    private UserServiceProxy userServiceProxy;
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
    public Policy savePolicy(PolicyDto policyDto) throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Policy policy = modelMapper.map(policyDto, Policy.class);
        BigInteger userId = policyDto.getOwner();
        User user;
        if(userService.isUserExistById(userId)) {
            user = entityManager.getReference(User.class, userId);
        } else {
            user = userServiceProxy.getUser(userId).getBody();

            String json = ow.writeValueAsString(user);
            System.out.println(json);
            UserDto userDto = modelMapper.map(user, UserDto.class);
            user = userService.addUser(userDto);
        }
        policy.setOwner(user);
        return policyRepository.save(policy);
    }
}
