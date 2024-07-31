package com.example.codechallenge.model.api;

import com.example.codechallenge.model.entity.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserResponse {

    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Boolean status;

    public UserResponse(UserEntity entity) {
        this.id = entity.getId();
        this.username = entity.getUsername();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.phone = entity.getPhone();
        this.status = entity.getStatus();
    }

}
