package com.emailService.emailService;

import com.emailService.controller.EmailController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = { EmailController.class })
@EnableAutoConfiguration
public class EmailServiceApplication {

	private String bar = new String("bar");
	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
		System.exit(0);
	}

}
