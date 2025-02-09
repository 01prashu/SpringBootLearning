package com.inheriting.test.entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ContactData {
	@NotBlank(message="use name can not empty")
	@Size(min=3, max=15,message="User name must be between 3-15 character")
	 String name;
	
	@Email
	 String email;
	
	@NotBlank(message="Message field should not be blank")
	 String message;
	public ContactData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactData(String name, String email, String message) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactData [name=" + name + ", email=" + email + ", message=" + message + "]";
	}
	
	
	
	 
}
