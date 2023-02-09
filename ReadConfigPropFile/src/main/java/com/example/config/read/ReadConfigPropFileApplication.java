package com.example.config.read;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:config.properties"})
@SpringBootApplication
public class ReadConfigPropFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadConfigPropFileApplication.class, args);		
		ApplicationContext context = SpringApplication.run(ReadConfigPropFileApplication.class, args);
		Employee emp = context.getBean(Employee.class);
		String name = emp.getName();
		System.out.println(name);
	}

}
