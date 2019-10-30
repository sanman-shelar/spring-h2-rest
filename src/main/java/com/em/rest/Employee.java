package com.em.rest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@Data
public class Employee {
	
	@Id
	private String eid;
	private String aid;
	private String name;
	private int age;

}
