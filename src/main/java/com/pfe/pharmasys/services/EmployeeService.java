package com.pfe.pharmasys.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.pharmasys.entities.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public Optional<Employee> findEmployee(UUID id);
	
	public List<Employee> listEmployee();
	
	public void deleteEmployee(UUID id);
	
	public Optional<Employee> findByEmail(String email);


}
