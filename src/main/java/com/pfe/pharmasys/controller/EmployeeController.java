package com.pfe.pharmasys.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.pharmasys.entities.Employee;
import com.pfe.pharmasys.services.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping(value="/add")
	public void addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
	}
	
	@PutMapping(value="/update")
	public void updateEmployee(@RequestBody Employee employee) {
		service.updateEmployee(employee);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Employee> findEmployee(@PathVariable("id") UUID id) {
		return service.findEmployee(id);
	}
	
	@GetMapping(value="/all")
	public List<Employee> listEmployee(){
		return service.listEmployee();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteEmployee(@PathVariable UUID id) {
		service.deleteEmployee(id);
	}

}
