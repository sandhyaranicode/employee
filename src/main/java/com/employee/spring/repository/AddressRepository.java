package com.employee.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.spring.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
