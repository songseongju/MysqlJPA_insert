package com.example.MysqlJPA.service;


import com.example.MysqlJPA.repository.UserRepo;
import com.example.MysqlJPA.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public UserEntity insertUser(UserEntity user) {
        return userRepository.save(user);
    }
}
