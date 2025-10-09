package com.jc.springboot.jc_springboot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
/*By default, Spring Boot loads both application.yml and application.properties from src/main/resources.
If a property is defined in both, application.properties takes precedence.*/
public class JcSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JcSpringbootAppApplication.class, args);
	}

}
