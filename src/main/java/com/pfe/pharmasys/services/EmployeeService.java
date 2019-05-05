package com.pfe.pharmasys.services;

import java.util.List;
import java.util.Optional;


import com.pfe.pharmasys.entities.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public Optional<Employee> findEmployee(Long id);
	
	public List<Employee> listEmployee();
	
	public void deleteEmployee(Long id);
	
	public Optional<Employee> findByEmail(String email);

	public Employee authentication(String login, String pwd);

	public Employee findByLogin(String login);

	public Employee findByEmailAndLogin(String login, String email);


}
