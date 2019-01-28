package com.example.cs4500sp19s3jga.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.cs4500sp19s3jga.models.Address;

public interface AddressRepository
	extends CrudRepository<Address, Integer>{
	@Query(value="SELECT address FROM Address address")
	public List<Address> findAllAddresses();
}
