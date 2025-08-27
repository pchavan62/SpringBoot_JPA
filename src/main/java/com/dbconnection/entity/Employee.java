package com.dbconnection.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Long id;
	private String name;
	private String age;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(Long id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
