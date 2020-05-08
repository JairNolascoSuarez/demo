package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee insert(Employee emp) {
		return employeeRepository.insert(emp);
	}

	@Override
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	@Override
	public void deleteById(String empNo) {
		employeeRepository.deleteById(empNo);
	}	
	
}
