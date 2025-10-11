package com.sb.jpa.jpa_demo_jc;

import com.sb.jpa.jpa_demo_jc.Model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testCreateAndGetEmployee() {
        String baseUrl = "http://localhost:" + port + "/employees";

        Employee emp = new Employee();
        emp.setName("Alice");
        emp.setDepartment("IT");
        emp.setEmail("alice@example.com");

        Employee created = restTemplate.postForObject(baseUrl, emp, Employee.class);
        assertThat(created).isNotNull();
        assertThat(created.getName()).isEqualTo("Alice");

        Employee[] employees = restTemplate.getForObject(baseUrl, Employee[].class);
        assertThat(employees).hasSize(1);
        assertThat(employees[0].getName()).isEqualTo("Alice");
    }
}

