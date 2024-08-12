package com.example.MysqlJPA.controller;

import com.example.MysqlJPA.service.UserService;
import com.example.MysqlJPA.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class controller {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public ResponseEntity<?> insertEntity(@RequestBody UserEntity entity) {
        return ResponseEntity.ok(userService.insertUser(entity));
    }
}
