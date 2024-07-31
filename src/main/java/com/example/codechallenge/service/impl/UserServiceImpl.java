package com.example.codechallenge.service.impl;

import com.example.codechallenge.model.api.UserRequest;
import com.example.codechallenge.model.api.UserResponse;
import com.example.codechallenge.model.entity.UserEntity;
import com.example.codechallenge.repository.UserRepository;
import com.example.codechallenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    /**
     * Metodo que registra al usuario.
     * @param request {@link UserRequest}
     */
    @Override
    public void save(UserRequest request) {
        UserEntity uq = new UserEntity();
        uq.setPhone(request.getPhone());
        uq.setEmail(request.getEmail());
        uq.setPassword(request.getPassword());
        uq.setUsername(request.getUsername());
        uq.setLastName(request.getLastName());
        repository.save(uq);
    }


    /**
     * Metodo que retorna el listado de usuarios
     *
     * @return {@link UserResponse[]}
     */
    @Override
    public List<UserResponse> users() {
        return repository.findAll().stream().map(UserResponse::new).collect(Collectors.toList());
    }

    /**
     * Metodo que realiza la busqueda de un usuario desde el tipo.
     *
     * @param type  Tipo para identificar como va a ser la consulta (PHONE, EMAIL).
     * @param value Valor que va a ser utilizado para la busqueda.
     * @return {@link UserResponse}
     */
    @Override
    public UserResponse find(String type, String value) {
        UserEntity userEntity = null;

        if ("EMAIL".equalsIgnoreCase(type)){
            userEntity = repository.findByEmail(value);
        } else if ("PHONE".equalsIgnoreCase(type)) {
            userEntity = repository.findByPhone(value);
        }else {
            throw new IllegalArgumentException("Tipo de busqueda no valida" + type);
        }

        if (userEntity != null) {
            return new UserResponse(userEntity);  // Convertir UserEntity a UserResponse
        } else {
            throw new RuntimeException("No se encontró un usuario con " +
                    (type.equalsIgnoreCase("EMAIL") ? "correo electrónico" : "teléfono") + ": " + value);
        }
    }

}
