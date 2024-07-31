package com.example.codechallenge.model.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserRequest {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;

}
