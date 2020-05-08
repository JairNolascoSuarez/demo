package com.example.demo.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.Employee;


@Repository
public interface EmployeeRepository extends MongoRepository <Employee, String>{


	@Override
	List<Employee> findAll(); // find all Employee
	<S extends Employee> S insert(S Employee); //add employee
	<S extends Employee> S save(S Employee); //update employee
	void deleteById (String empNo);// delete employee
	
	
	

}
