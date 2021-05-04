package com.employee.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	@Id
	
	private int add_id;
	private String city;
	private String state;
	private int pincode;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(int add_id, String city, String state, int pincode) {
		super();
		this.add_id = add_id;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
