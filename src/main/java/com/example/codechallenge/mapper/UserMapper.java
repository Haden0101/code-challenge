package com.example.codechallenge.mapper;

import com.example.codechallenge.model.api.UserRequest;
import com.example.codechallenge.model.api.UserResponse;
import com.example.codechallenge.model.entity.UserEntity;

public class UserMapper {

    private UserMapper() {}

    /**
     * Metodo que convierte el Request a la Entidad.
     * @param request {@link UserRequest}
     * @return {@link UserEntity}
     */
    public static UserEntity mapEntity(UserRequest request) {
        UserEntity response = new UserEntity();
        response.setUsername(request.getUsername());
        response.setFirstName(request.getFirstName());
        response.setLastName(request.getLastName());
        response.setEmail(request.getEmail());
        response.setPassword(request.getPassword());
        response.setPhone(request.getPhone());
        response.setStatus(true);
        return response;
    }

    /**
     * Metodo que convierte la Entidad al Response.
     * @param userEntity {@link UserEntity}
     * @return {@link UserResponse}
     */
    public static UserResponse mapResponse(UserEntity userEntity) {
        UserResponse response = new UserResponse();
        response.setId(userEntity.getId());
        response.setUsername(userEntity.getUsername());
        response.setFirstName(userEntity.getFirstName());
        response.setLastName(userEntity.getLastName());
        response.setEmail(userEntity.getEmail());
        response.setPassword(userEntity.getPassword());
        response.setPhone(userEntity.getPhone());
        response.setStatus(userEntity.getStatus());
        return response;
    }
}
