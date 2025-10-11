package com.sb.jpa.jpa_demo_jc.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.jpa.jpa_demo_jc.Model.Employee;
import com.sb.jpa.jpa_demo_jc.Repo.MyRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {
    private final MyRepository myRepository;

    public EmployeeService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
    public Employee createEmployee(Employee employee) {
        return myRepository.save(employee);
    }

    public List<Employee> getEmployeeById(long id) {
        return myRepository.findById(id);
    }
    public void deleteEmployeeById(long id) {
        myRepository.deleteById(id);
    }
    public int updateEmployeeById(long id, String name, String dept, String email) {
        return myRepository.updateEmployeeById(id, name, dept, email);
    }
}
