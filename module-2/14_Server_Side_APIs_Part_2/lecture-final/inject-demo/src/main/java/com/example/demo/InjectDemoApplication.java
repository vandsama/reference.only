package com.example.demo;

import org.apache.commons.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjectDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectDemoApplication.class, args);
	}

	public InjectDemoApplication(Logger logger) {
		logger.log("#### application starting ####");
	}
}
