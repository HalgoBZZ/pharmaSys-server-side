package com.pfe.pharmasys.doa;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pfe.pharmasys.entities.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, UUID> {
	
	@Query("select e from Employee e where e.email_emp = :email ")
	public Optional<Employee> findByEmail(@Param("email")String email);

}
