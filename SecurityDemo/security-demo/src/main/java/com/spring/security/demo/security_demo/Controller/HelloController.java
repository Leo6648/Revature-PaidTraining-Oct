package com.spring.security.demo.security_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String greeString(HttpServletRequest request){
        return "Welcome to Spring Security "+ request.getSession().getId();
    }

}
