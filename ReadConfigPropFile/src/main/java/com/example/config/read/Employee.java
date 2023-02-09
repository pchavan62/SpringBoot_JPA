package com.example.config.read;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
public class Employee {
	
	private String name;
	private String empid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + "]";
	}
	
}
