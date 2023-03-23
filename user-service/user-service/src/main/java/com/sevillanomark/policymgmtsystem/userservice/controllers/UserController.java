package com.sevillanomark.policymgmtsystem.userservice.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sevillanomark.policymgmtsystem.userservice.dtos.UserDto;
import com.sevillanomark.policymgmtsystem.userservice.models.User;
import com.sevillanomark.policymgmtsystem.userservice.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<User>> getListUsers(
            @RequestParam(value = "criteria", required = false) String criteria
    ) {
        if (criteria != null) {
            return ResponseEntity.ok(userService.searchUserByName(criteria));
        }
        return ResponseEntity.ok(userService.findAllUsers());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(
            @PathVariable BigInteger id
    ) {
        return ResponseEntity.ok(userService.findUserById(id));
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody UserDto newUser) throws JsonProcessingException {
        return new ResponseEntity(userService.addUser(newUser), HttpStatus.CREATED);
    }
}
