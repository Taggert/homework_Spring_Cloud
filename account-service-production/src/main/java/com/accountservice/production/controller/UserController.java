package com.accountservice.production.controller;

import com.accountservice.production.model.User;
import com.accountservice.production.model.UserWeb;
import com.accountservice.production.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public UserWeb save(@RequestBody UserWeb userWeb){
        User user = User.builder()
                .username(userWeb.getUsername())
                .firstname(userWeb.getFirstname())
                .lastname(userWeb.getLastname())
                .build();
        userRepository.save(user);
        return userWeb;
    }

}