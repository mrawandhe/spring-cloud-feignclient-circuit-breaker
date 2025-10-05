package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableFeignClients(basePackages = "com.example.external")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

/**
 * Key links 
 * https://github.com/spring-cloud/spring-cloud-openfeign/issues/611
 */
