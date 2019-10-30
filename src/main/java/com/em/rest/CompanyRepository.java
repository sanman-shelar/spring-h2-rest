package com.em.rest;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompanyRepository extends JpaRepository<Company, String> { 

	@Query("select company from Company company join fetch company.employees employee where employee.eid = :eid")
	public Optional<Company> findByEid(@Param(value = "eid") String eid);
	
	@Query("select company from Company company join fetch company.employees employee where employee.aid = :aid")
	public Optional<Company> findByAid(@Param(value = "aid") String aid);
	
	public Optional<Company> findByCid(@Param(value = "cid") String cid);
}
