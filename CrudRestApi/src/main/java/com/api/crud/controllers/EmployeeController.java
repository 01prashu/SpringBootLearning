package com.api.crud.controllers;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.entities.Employee;

@RestController
public class EmployeeController {
	static ArrayList<Employee>empList= new ArrayList<>();
	static {
		
		empList.add(new Employee(12,"tudf","ierei"));
		empList.add(new Employee(23,"kdjfd","dkfldf"));
		empList.add(new Employee(34,"rfdf","sfffs"));
		empList.add(new Employee(56,"erere","fdfdf"));
	}
	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/employee")
	public ArrayList<Employee>getEmps()
	{
		
		return empList;
	}
	@GetMapping("/employee/{id}")
	public Employee GetEmp(@PathVariable("id")int id)
	{
		for(Employee emp:empList)
		{
			if(emp.getId()==id)
			{
				return emp;
			}
		}
		return null;
	}
//	@GetMapping("/employee/{id}")
//	public ResponseEntity<Employee>getRes(@PathVariable("id") int id)
//	{
//		for(Employee emp:empList)
//		{
//			if(emp.getId()==id)
//			{
//				return ResponseEntity.status(HttpStatus.ACCEPTED).build();
//			}
//		}
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//	}
	
	@PutMapping("/employee/{id}")
	public Employee doUpdate(@PathVariable("id") int id,@RequestBody Employee req_emp)
	{
		for(Employee emp:empList)
		{
			if(emp.getId()==id)
			{
				emp.setCity(req_emp.getCity());
				emp.setName(req_emp.getName());
				return emp;
			}
		}
		return null;
	}
	@DeleteMapping("/employee/{del_id}")
	public void doDelete(@PathVariable("del_id")int id)
	{
		for(Employee emp:empList)
		{
			if(emp.getId() ==id)
			{
				empList.remove(emp);
				return;
			}
		}
		
	}
	@PostMapping("/employee")
	public Employee doCreate(@RequestBody Employee emp_create)
	{
		empList.add(emp_create);
		return emp_create;
	}
}
