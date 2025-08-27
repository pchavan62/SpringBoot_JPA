package com.dbconnection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbconnection.service.EmployeeService;

@RestController
public class DBController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public String getEmployeeData() {
		return employeeService.getEmployeeData();
	}

}
