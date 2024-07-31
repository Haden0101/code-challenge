package com.example.codechallenge.service;

import com.example.codechallenge.model.api.UserRequest;
import com.example.codechallenge.model.api.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void save(UserRequest request);
    List<UserResponse> users();
    UserResponse find(String type, String value);

}
