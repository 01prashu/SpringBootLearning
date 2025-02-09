package com.relationship.test.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	private int house_no;
	
	
	private String city;
	
	
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int house_no, String city, String state) {
		super();
		this.house_no = house_no;
		this.city = city;
		this.state = state;
	}
	public int getHouse_no() {
		return house_no;
	}
	public void setHouse_no(int house_no) {
		this.house_no = house_no;
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
	
}
