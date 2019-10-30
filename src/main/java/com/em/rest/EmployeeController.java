package com.em.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee/id/{eid}")
	public @ResponseBody Optional<Employee> findDataUsingId(@PathVariable String eid) {
		return employeeService.getEmployeeDataUsingEid(eid);
	}
}
