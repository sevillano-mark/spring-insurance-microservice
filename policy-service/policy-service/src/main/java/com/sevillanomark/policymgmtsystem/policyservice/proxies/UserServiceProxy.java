package com.sevillanomark.policymgmtsystem.policyservice.proxies;

import com.sevillanomark.policymgmtsystem.policyservice.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigInteger;

@FeignClient(name="user-service")
public interface UserServiceProxy {
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(
            @PathVariable BigInteger id
    );
}
