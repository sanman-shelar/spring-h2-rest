package com.em.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringH2RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringH2RestApplication.class, args);
	}

}
