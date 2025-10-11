package com.sb.jpa.jpa_demo_jc;

import com.sb.jpa.jpa_demo_jc.Controller.EmployeeController;
import com.sb.jpa.jpa_demo_jc.Model.Employee;
import com.sb.jpa.jpa_demo_jc.Service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;

class EmployeeControllerTest {

    private MockMvc mockMvc;

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeController employeeController;

    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
        objectMapper = new ObjectMapper();
    }

    @Test
    void testCreateEmployee() throws Exception {
        // Mock input and output
        Employee inputEmployee = new Employee();
        inputEmployee.setName("John Doe");
        inputEmployee.setEmail("john@example.com");

        Employee savedEmployee = new Employee();
        savedEmployee.setId(1L);
        savedEmployee.setName("John Doe");
        savedEmployee.setEmail("john@example.com");

        // Mock service behavior
        when(employeeService.createEmployee(any(Employee.class))).thenReturn(savedEmployee);

        // Perform POST request
        mockMvc.perform(post("/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(inputEmployee)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.name").value("John Doe"))
                .andExpect(jsonPath("$.email").value("john@example.com"));
    }
}
