package com.em.rest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company")
@NoArgsConstructor
@Data
public class Company {
	
	@Id
	private String cid;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cid", referencedColumnName = "cid", nullable = false, updatable = false)
	private List<Employee> employees = new ArrayList<>();

}