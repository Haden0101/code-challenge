package com.example.codechallenge.controller;

import com.example.codechallenge.model.api.UserRequest;
import com.example.codechallenge.model.api.UserResponse;
import com.example.codechallenge.model.entity.UserEntity;
import com.example.codechallenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "${application.api.path}")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/create")
    public void save(@RequestBody UserRequest request) {
        service.save(request);
    }

    @GetMapping("/get-user")
    public List<UserResponse> users() {
        return service.users();
    }

    @GetMapping(path = "/find")
    public UserResponse find(
            @RequestParam("type") String type,
            @RequestParam("value") String value) {
        return service.find(type, value);
    }

}
