package com.example.demo.service;

import java.util.List;

import com.example.demo.controller.Employee;

public interface EmployeeService {
	List<Employee> findAll();
	Employee insert(Employee emp);
	Employee save(Employee emp);
	void deleteById(String empNo);
	
	
}
