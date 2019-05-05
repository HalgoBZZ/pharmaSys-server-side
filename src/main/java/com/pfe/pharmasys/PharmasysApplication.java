package com.pfe.pharmasys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pfe.pharmasys.entities.Configurations;
import com.pfe.pharmasys.entities.Employee;
import com.pfe.pharmasys.entities.types.Role;
import com.pfe.pharmasys.services.ConfigurationsService;
import com.pfe.pharmasys.services.EmployeeService;

@SpringBootApplication
public class PharmasysApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private ConfigurationsService confService;

	public static void main(String[] args) {
		SpringApplication.run(PharmasysApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setLogin("admin");
		employee.setPwd("admin");
		employee.setNom_emp("admin");
		employee.setPrenom_emp("admin");
		employee.setRole_emp(Role.Admin);
		employee.setEmail_emp("hafedh.baazouzi@gmail.com");
		if (!(service.findByEmail(employee.getEmail_emp()).isPresent())) {
			service.addEmployee(employee);
		}
		
		List<Configurations> configurations = confService.getAll();
		if(configurations.isEmpty()) {
			Configurations configuration = new Configurations();
			configuration.setExpiration(0);
			configuration.setSeuil_qte(0);
			confService.save(configuration);
		}
		
	}

}
