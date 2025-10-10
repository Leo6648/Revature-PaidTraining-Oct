package com.sb.controller.jc.sb_controll_prac_jc.controllers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleArithmeticException(ArithmeticException ex) {
        return "Error: Division by zero is not allowed.";
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleGenericException(Exception ex) {
        return "Error: Invalid input. Please provide valid numbers in the path variable.";
    }
}
