package com.pfe.pharmasys.doa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pfe.pharmasys.entities.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
	
	@Query("select e from Employee e where e.email_emp = :email ")
	public Optional<Employee> findByEmail(@Param("email")String email);

	@Query("select e from Employee e where e.login = :login and e.pwd = :pwd")
	public Employee authentication(@Param("login")String login, @Param("pwd")String pwd);
	
	@Query("select e from Employee e where e.login = :login")
	public Employee findByLogin(@Param("login")String login);

	@Query("select e from Employee e where e.login = :login and e.email_emp = :email")
	public Employee findByEmailAndLogin(@Param("login")String login, @Param("email")String email);

}
