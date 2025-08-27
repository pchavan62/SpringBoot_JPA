package com.dbconnection.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbconnection.entity.Employee;
import com.dbconnection.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public String getEmployeeData() {
		// TODO Auto-generated method stub
		
		Optional<Employee> emp = employeeRepo.findById(2L);
		if(emp.isPresent()) {
			return emp.get().toString();
		}
		return null;
	}

}
