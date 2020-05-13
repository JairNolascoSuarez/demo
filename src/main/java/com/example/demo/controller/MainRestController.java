package com.example.demo.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.controller.EmployeeDAO;
import com.example.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
public class MainRestController {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String welcome()	{
		return "First spring boot Application";
		
	}
	@RequestMapping("/second")
	public String welcomesecond()	{
		System.out.println("debugin");
		return "Second spring boot Application";
		
	}
	
	// message
	@Value("${message:Hello}")
	private String message;
	
	//message
	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}

	
	// URL - http://localhost:8080/listEmployees
	@RequestMapping(value = "listEmployees", method = RequestMethod.GET) // or use @GetMapping
	public java.util.List<Employee> listEmployees() {
		return employeeService.findAll();
	}

	// URL - http://localhost:8080/AddEmployee
	@RequestMapping(value = "AddEmployee", method = RequestMethod.POST) // or use @GetMapping
	public Employee AddEmployee(@RequestBody Employee emp) {
		return employeeService.insert(emp);
	}

	// URL - http://localhost:8080/AddEmployee
	@RequestMapping(value = "UpdateEmployee", method = RequestMethod.PUT) // or use @GetMapping
	public Employee UpdateEmployee(@RequestBody Employee emp) {
		return employeeService.save(emp);
	}
	
	
	// URL - http://localhost:8080/DeleteEmployee
	@RequestMapping(value = "DeleteEmployee/{empNo}", method = RequestMethod.DELETE) // or use @GetMapping
	public void delete(@PathVariable("empNo") String empNo) {
			employeeService.deleteById(empNo);
	}

	
	
	// URL - http://localhost:8080/employees

//	@RequestMapping(value = "/employees", //
//
//			method = RequestMethod.GET, //
//
//			produces = { MediaType.APPLICATION_JSON_VALUE })
//
//	public List<Employee> getEmployees() {
//
//		List<Employee> list = employeeDAO.getAllEmployees();
//
//		return list;
//
//	}
//


	// URL - http://localhost:8080/employee/{empNo}

//	@RequestMapping(value = "/employee/{empNo}", //
//
//			method = RequestMethod.GET, //
//
//			produces = { MediaType.APPLICATION_JSON_VALUE })
//
//	public Employee getEmployee(@PathVariable("empNo") String empNo) {
//
//		return employeeDAO.getEmployee(empNo);
//
//	}

	
	// URL - http://localhost:8080/delete/employee/{empNo}
    // delete
//	@RequestMapping(value = "/delete/employee/{empNo}", //
//
//			method = RequestMethod.DELETE, //
//
//			produces = { MediaType.APPLICATION_JSON_VALUE })
//
//	public String deleteEmployee(@PathVariable("empNo") String empNo) {
//		
//		System.out.println("Delete " + empNo.toString());
//		
//		employeeDAO.deleteEmployee(empNo.toString());
//
//		return "200";
//
//
//	
//	}
	

	// URL - http://localhost:8080/update/employee
    // update
//	@RequestMapping(value = "/update/employee", //
//
//			method = RequestMethod.PUT, //
//
//			produces = { MediaType.APPLICATION_JSON_VALUE })
//	
//	
//	
//	public String updateEmployee(@PathVariable("empNo") String empNo,@PathVariable("empName")String empName,@PathVariable("position") String position) {
//	
//		
//		employeeUpdated.setEmpNo(empNo.toString());
//		employeeUpdated.setEmpName(empName.toString());
//		employeeUpdated.setPosition(position.toString());
//		
//		System.out.println("Update " + employeeUpdated);
//		
//		employeeDAO.updateEmployee(employeeUpdated);
//
//		return "200";
//
//
//	
//	}

	
}
