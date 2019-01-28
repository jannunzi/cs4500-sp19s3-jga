package com.example.cs4500sp19s3jga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cs4500sp19s3jga.models.Address;
import com.example.cs4500sp19s3jga.models.User;
import com.example.cs4500sp19s3jga.repositories.AddressRepository;
import com.example.cs4500sp19s3jga.repositories.UserRepository;

@RestController
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	UserRepository userRepository;
	@PutMapping("/api/addresses/{id}")
	public Address updateAddress(
			@PathVariable("id") Integer id,
			@RequestBody Address newAddress) {
		Address address = addressRepository.findAddressById(id);
		address.setStreet1(newAddress.getStreet1());
		address.setStreet2(newAddress.getStreet2());
		address.setCity(newAddress.getCity());
		address.setState(newAddress.getState());
		address.setCountry(newAddress.getCountry());
		return addressRepository.save(address);
	}
	@PostMapping("/api/users/{userId}/addresses")
	public Address addAddressToUser(
			@PathVariable("userId") Integer id,
			@RequestBody Address address) {
		User user = userRepository.findUserById(id);
		address.setUser(user);
		return addressRepository.save(address);
	}
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
