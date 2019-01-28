package com.example.cs4500sp19s3jga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cs4500sp19s3jga.models.Address;
import com.example.cs4500sp19s3jga.repositories.AddressRepository;
import com.example.cs4500sp19s3jga.repositories.UserRepository;

@RestController
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	UserRepository userRepository;
	@GetMapping("/api/users/{userId}/addresses")
	public List<Address> findAddressesForUser(
			@PathVariable("userId") Integer userId) {
		return userRepository.findUserById(userId).getAddresses();
	}
	@GetMapping("/api/addresses")
	public List<Address> findAllAddresses() {
		return addressRepository.findAllAddresses();
	}
	@GetMapping("/api/addresses/{id}")
	public Address findAddressById(
			@PathVariable("id") Integer id) {
		return addressRepository.findAddressById(id);
	}
}
