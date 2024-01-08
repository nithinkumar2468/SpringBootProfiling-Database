package com.springbootprofiling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootprofiling.model.Employee;
import com.springbootprofiling.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	public Employee newEmp(Employee newEmployee) {
		// TODO Auto-generated method stub
		return empRepo.save(newEmployee);
	}

	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}
}
