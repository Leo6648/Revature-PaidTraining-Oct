package com.sb.controller.jc.sb_controll_prac_jc.controllers;
import com.sb.controller.jc.sb_controll_prac_jc.models.UserModel;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserController {
    @RequestMapping("/user")
    public UserModel getUser() {
        return new UserModel("Max", 21);
    }
    @GetMapping("/user-default")
    public ResponseEntity<UserModel> getUserDefault() {
        UserModel user = new UserModel("Elvis", 25);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/user-list")
    public List<UserModel> allUsers() {
        return List.of(
            new UserModel("Alice", 30),
            new UserModel("Bob", 28),
            new UserModel("Charlie", 35)
        );
    }
    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody UserModel user) {
        //TODO: process POST request
        System.out.println("Received user: " + user.getName() + ", Age: " + user.getAge());
        
        return ResponseEntity.ok("User created successfully");
    }
    
    
}
