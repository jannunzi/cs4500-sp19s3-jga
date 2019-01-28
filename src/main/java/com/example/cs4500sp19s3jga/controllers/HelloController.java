package com.example.cs4500sp19s3jga.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cs4500sp19s3jga.models.User;

@RestController
public class HelloController	 {
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
	@GetMapping("/api/user/{username}")
	public User getUser(
			@PathVariable("username") String u) {
		User alice = new User();
		alice.setUsername(u);
		alice.setFirstName("Somebody");
		alice.setLastName("Someone else");
		return alice;
	}
}
