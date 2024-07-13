package com.api.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.api.crud.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee , Integer> {
	

}
