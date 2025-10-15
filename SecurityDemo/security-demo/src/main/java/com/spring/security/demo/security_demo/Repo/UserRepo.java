package com.spring.security.demo.security_demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.demo.security_demo.Model.Users;


public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
