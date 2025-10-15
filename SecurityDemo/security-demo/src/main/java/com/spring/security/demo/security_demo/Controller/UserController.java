package com.spring.security.demo.security_demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.demo.security_demo.Model.Users;
import com.spring.security.demo.security_demo.Service.UserService;


@RestController
@RequestMapping("/public")
public class UserController {
    @Autowired
    private UserService service;


    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return service.register(user);

    }

    @GetMapping("/again")
    public String again() {
        return "Hello, World Again and again!";
    }
}
