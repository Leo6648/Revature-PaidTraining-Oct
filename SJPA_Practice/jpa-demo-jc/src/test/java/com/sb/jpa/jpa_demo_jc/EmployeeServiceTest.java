package com.sb.jpa.jpa_demo_jc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.sb.jpa.jpa_demo_jc.Model.Employee;
import com.sb.jpa.jpa_demo_jc.Repo.MyRepository;
import com.sb.jpa.jpa_demo_jc.Service.EmployeeService;

class EmployeeServiceTest {

    @Mock
    private MyRepository myRepository;

    @InjectMocks
    private EmployeeService employeeService;

    private Employee employee;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        employee = new Employee("John Doe", "IT", "john@example.com");
    }

    @Test
    void testCreateEmployee() {
        when(myRepository.save(employee)).thenReturn(employee);

        Employee result = employeeService.createEmployee(employee);

        assertNotNull(result);
        assertEquals("John Doe", result.getName());
        verify(myRepository, times(1)).save(employee);
    }

    @Test
    void testGetEmployeeById() {
        when(myRepository.findById(1L)).thenReturn(Arrays.asList(employee));

        List<Employee> result = employeeService.getEmployeeById(1L);

        assertEquals(1, result.size());
        assertEquals("IT", result.get(0).getDepartment());
        verify(myRepository, times(1)).findById(1L);
    }

    @Test
    void testDeleteEmployeeById() {
        doNothing().when(myRepository).deleteById(1L);

        employeeService.deleteEmployeeById(1L);

        verify(myRepository, times(1)).deleteById(1L);
    }

    @Test
    void testUpdateEmployeeById() {
        when(myRepository.updateEmployeeById(1L, "Jane", "HR", "jane@example.com"))
            .thenReturn(1);

        int result = employeeService.updateEmployeeById(1L, "Jane", "HR", "jane@example.com");

        assertEquals(1, result);
        verify(myRepository, times(1))
            .updateEmployeeById(1L, "Jane", "HR", "jane@example.com");
    }
}

