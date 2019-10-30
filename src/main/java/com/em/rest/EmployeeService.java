package com.em.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional
	public Optional<Employee> getEmployeeDataUsingEid(String eid) {
		Optional<Employee> employee = employeeRepository.findByEid(eid);
		return employeeRepository.findByAid(employee.get().getAid());
	}
}
