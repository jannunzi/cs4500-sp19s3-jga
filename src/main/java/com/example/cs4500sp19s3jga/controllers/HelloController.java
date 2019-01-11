package com.example.cs4500sp19s3jga.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cs4500sp19s3jga.models.User;

@RestController
public class HelloController {
	@GetMapping("/api/hello")
	public String sayHello() {
		return "Hello World";
	}
	@GetMapping("/api/user/alice")
	public User getUser() {
		User alice = new User();
		alice.setUsername("alice");
		alice.setFirstName("Alice");
		alice.setLastName("Wonderland");
		return alice;
	}
}
