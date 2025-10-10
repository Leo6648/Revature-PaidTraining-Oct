package com.sb.controller.jc.sb_controll_prac_jc.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class MyRestControl {
    @RequestMapping("/Movie")
    public String movie() {
        return "Star Wars";
    }
    
}
