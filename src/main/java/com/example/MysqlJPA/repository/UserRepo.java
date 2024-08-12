package com.example.MysqlJPA.repository;

import com.example.MysqlJPA.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Long> {

}
