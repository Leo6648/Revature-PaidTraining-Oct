package com.sb.controller.jc.sb_controll_prac_jc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MyController {
    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "Home Page";
    }
    @GetMapping("/next")
    public String next() {
        return "Next Page";
    }
    
    
}
