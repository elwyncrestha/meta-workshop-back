package com.github.elwyncrestha.metaworkshopback.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.elwyncrestha.metaworkshopback.mapper.UserMapper;
import com.github.elwyncrestha.metaworkshopback.model.service.UserService;

/**
 * @author Elvin Shrestha on 5/1/2020
 */
@RestController
@RequestMapping(UserController.URL)
public class UserController {

    static final String URL = "/v1/users";
    private final UserService service;
    private final UserMapper userMapper;

    public UserController(
        UserService service,
        UserMapper userMapper) {
        this.service = service;
        this.userMapper = userMapper;
    }

    @GetMapping("/authenticated")
    public ResponseEntity<?> getUser() {
        return ResponseEntity.ok(userMapper.mapEntityToDto(service.findOne(1L)));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(userMapper.mapEntitiesToDtos(service.findAll()));
    }
}
