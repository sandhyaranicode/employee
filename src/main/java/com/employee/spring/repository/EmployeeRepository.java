package com.employee.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.spring.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	

}
