package com.pfe.pharmasys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pfe.pharmasys.entities.Employee;
import com.pfe.pharmasys.services.EmployeeService;

@SpringBootApplication
public class PharmasysApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(PharmasysApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setLogin("admin");
		employee.setPwd("admin");
		employee.setEmail_emp("admin@yahoo.fr");
		if (!(service.findByEmail(employee.getEmail_emp()).isPresent())) {
			service.addEmployee(employee);
		}
		
	}

}
