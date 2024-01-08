package com.springbootprofiling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootprofiling.model.Employee;
import com.springbootprofiling.service.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeService empService;
	
	@Value("${message}") //SPEL language
	String msg;

	@GetMapping("/welcome")
	public String getMessage()
	{
		return "Hi "+msg;
	}
	
	@PostMapping("/employee")
	Employee newEmployee(@RequestBody Employee newEmployee) {
		return empService.newEmp(newEmployee);
	}
	
	@GetMapping("/getall")
	List<Employee> getAllEmployees() {
		return empService.findAllEmployees();

	}
}