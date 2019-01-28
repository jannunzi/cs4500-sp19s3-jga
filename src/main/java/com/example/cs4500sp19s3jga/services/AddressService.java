package com.example.cs4500sp19s3jga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cs4500sp19s3jga.models.Address;
import com.example.cs4500sp19s3jga.repositories.AddressRepository;

@RestController
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
	@GetMapping("/api/addresses")
	public List<Address> findAllAddresses() {
		return addressRepository.findAllAddresses();
	}
}
