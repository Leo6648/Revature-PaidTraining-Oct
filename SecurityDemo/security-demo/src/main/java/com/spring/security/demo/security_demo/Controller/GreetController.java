package com.spring.security.demo.security_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class GreetController {
    @GetMapping("/greet")
    public String greet() {
        return "Welcome , Hello, World!";
    }
}
