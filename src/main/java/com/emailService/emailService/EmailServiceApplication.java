package com.emailService.emailService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.emailService.consumer.Consumer;

@SpringBootApplication
@ComponentScan(basePackageClasses = { Consumer.class })
@EnableAutoConfiguration
public class EmailServiceApplication {

	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
