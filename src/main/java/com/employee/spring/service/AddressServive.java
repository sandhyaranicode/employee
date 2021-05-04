package com.employee.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.spring.entity.Address;
import com.employee.spring.repository.AddressRepository;

@Service
public class AddressServive {
	
	@Autowired
	public AddressRepository repository;
	
	public Address addAddress(Address address)
	{
		return repository.save(address);
		
	}
	public List<Address> saveAddress(List<Address> addresses)
	{
		return repository.saveAll(addresses);
	}
	

}
