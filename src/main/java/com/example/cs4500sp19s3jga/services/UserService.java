package com.example.cs4500sp19s3jga.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cs4500sp19s3jga.models.User;

@RestController
public class UserService {
	User alice = new User(123, "alice", "Alice", "Wonderland");
	User bob = new User(234, "bob", "Bob", "Marley");
	User[] users = {alice, bob};
	
	@GetMapping("/api/users")
	public User[] findAllUser() {
		return users;
	}
	@GetMapping("/api/users/{userId}")
	public User findUserById(
			@PathVariable("userId") Integer id) {
		for(User user: users) {
			if(user.getId().intValue() == id) {
				return user;
			}
		}
		return null;
	}
//	public User findUserByUsername(String username) {
//		
//	}
//	public User createUser(User user) {
//		
//	}
//	public void deleteUser(Integer id) {
//		
//	}
//	public User updateUser(Integer id, User user) {
//		
//	}
}
