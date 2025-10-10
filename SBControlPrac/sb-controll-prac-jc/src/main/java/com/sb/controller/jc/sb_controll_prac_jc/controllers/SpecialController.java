package com.sb.controller.jc.sb_controll_prac_jc.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SpecialController {
    //Greets user using @RequestParam to extract name and age from query parameters
    @GetMapping("/welcome")
    public String welcomeUser(@RequestParam String name, @RequestParam int age) {
        return "Welcome, " + name + "! You are " + age + " years old.";
    }
    @GetMapping("/user/{name}/age/{age}")
    public String getUserByInfo(@PathVariable String name, @PathVariable int age) {
        return "User name from path variable: " + name + ", Age: " + age;
    }
    
    @GetMapping("/adding")
    public String getAdd(@RequestParam int num1, @RequestParam int num2) {
        return "Sum: " + (num1 + num2);
    }

    @GetMapping("/division/{num1}/by/{num2}")
    public String getDivide(@PathVariable int num1, @PathVariable int num2) {
        return "Division: " + (num1 / num2);
    }
    
    
}
