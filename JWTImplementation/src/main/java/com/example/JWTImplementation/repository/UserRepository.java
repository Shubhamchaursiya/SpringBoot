package com.example.JWTImplementation.repository;

import com.example.JWTImplementation.model.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}