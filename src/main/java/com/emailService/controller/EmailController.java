package com.emailService.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EmailController {

	@GetMapping("/home")
	public String homeRequest() {
		return "Hello World!";
	}

}
