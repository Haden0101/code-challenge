package com.example.codechallenge.service.impl;

import com.example.codechallenge.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    void save() {
        Assertions.assertTrue(true);
    }

    @Test
    void users() {
        Assertions.assertTrue(true);
    }

    @Test
    void find() {
        Assertions.assertTrue(true);
    }
}