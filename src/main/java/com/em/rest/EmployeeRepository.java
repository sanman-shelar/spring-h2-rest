package com.em.rest;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, String> { 

	public Optional<Employee> findByEid(@Param(value = "eid") String eid);
	
	public Optional<Employee> findByAid(@Param(value = "aid") String aid);
}
