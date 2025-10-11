package com.sb.jpa.jpa_demo_jc.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.sb.jpa.jpa_demo_jc.Model.Employee;
import com.sb.jpa.jpa_demo_jc.Service.EmployeeService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }    
    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        
        return employeeService.createEmployee(employee);
    }
    
    /*@DeleteMapping("/employees/{id}")
    public void deleteEmployeeById(long id) {
        employeeService.deleteEmployeeById(id);
    }*/
}
