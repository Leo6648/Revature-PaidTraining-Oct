package com.jc.springboot.jc_springboot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class JcSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JcSpringbootAppApplication.class, args);
	}

}
