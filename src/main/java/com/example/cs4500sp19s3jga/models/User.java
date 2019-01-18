package com.example.cs4500sp19s3jga.models;

public class User {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private Integer id;
	private Book[] books;
	public User() {}
	public User(Integer i, String username, String firstName, String lastName) {
		this.id = i;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
