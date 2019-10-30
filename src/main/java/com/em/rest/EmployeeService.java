package com.em.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

	@Autowired
	private CompanyRepository cmpRepository;
	
	@Transactional
	public Optional<Company> getEmployeeDataUsingEid(String eid) {
		Optional<Company> company = cmpRepository.findByEid(eid);
		return cmpRepository.findByAid(company.get().getEmployees().get(0).getAid());
	}
}
