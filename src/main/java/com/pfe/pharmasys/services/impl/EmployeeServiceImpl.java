package com.pfe.pharmasys.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pharmasys.doa.EmployeeDao;
import com.pfe.pharmasys.entities.Employee;
import com.pfe.pharmasys.services.EmployeeService;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public void addEmployee(Employee employee) {
		employee.setDate_ajout(LocalDate.now());
		employee.setDate_modification(LocalDate.now());
		employeeDao.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employee.setDate_modification(LocalDate.now());
		employeeDao.save(employee);
	}

	@Override
	public Optional<Employee> findEmployee(UUID id) {
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> listEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public void deleteEmployee(UUID id) {
		employeeDao.deleteById(id);		
	}

	@Override
	public Optional<Employee> findByEmail(String email) {
		return employeeDao.findByEmail(email);
	}

}
