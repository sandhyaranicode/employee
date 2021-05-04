package com.employee.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.spring.entity.Employee;
import com.employee.spring.service.EmployeeServive;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServive service;
	

	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
		
	}
/*	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody Address address)
	{
		return service.saveAddress(address);
	}*/
	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
		return service.saveEmployees(employees);
		
	}
	@GetMapping("/employees")
	
	public @ResponseBody List<Employee> findAllEmployees()
	{
		return service.getEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee findProductById(@PathVariable int id)
	{
	
		return service.getEmployeeById(id);
	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
//	@PutMapping("/update")
//	public Address updateEmployee(@RequestBody Address employee) {
//		return service.updateAddress(employee);
//	
//	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		return service.deleteproduct(id);
	}
//	
//	@DeleteMapping("/delete/{address}")
//	public String deleteEmployee(@PathVariable String address)
//	{
//		return service.deleteEmployee(address);
//	}



}
