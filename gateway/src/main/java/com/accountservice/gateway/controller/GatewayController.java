package com.accountservice.gateway.controller;

import com.accountservice.gateway.model.UserWeb;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GatewayController {

    @Value("${account.service.path}")
    String url;

    @PostMapping("/save")
    public UserWeb save(@RequestBody UserWeb userRequest) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserWeb> entity = restTemplate.postForEntity(url,userRequest,UserWeb.class);
        return entity.getBody();
    }


}