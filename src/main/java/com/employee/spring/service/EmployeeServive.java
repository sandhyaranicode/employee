package com.employee.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.spring.entity.Employee;
import com.employee.spring.repository.EmployeeRepository;



@Service
public class EmployeeServive {
	
	
	
	@Autowired
	public EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee)
	{
		return repository.save(employee);
	}
	public List<Employee> saveEmployees(List<Employee> employees)
	{
		return repository.saveAll(employees);
	}
	public List<Employee> getEmployees()
	{
		return repository.findAll();
	}
	
	public Employee getEmployeeById(int id)
	{
		return repository.findById(id).orElse(null);
	}

	public Employee updateProduct(Employee employee)
	{
		
		
		Employee existingEmployee=repository.findById(employee.getId()).orElse(null);
		existingEmployee.setName(employee.getName());
		return repository.save(existingEmployee);
		
	}
	public String deleteproduct(int id)
	{
		repository.deleteById(id);
		return  "employee deteled";
		}
	public Employee getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	

}
