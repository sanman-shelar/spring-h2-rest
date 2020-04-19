package com.em.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Feature("Employee Info System")
@Story("Employee REST API")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate that response is 200")
	public void httpStatusIsOK() throws RestClientException, MalformedURLException {
		ResponseEntity<Company> response = restTemplate
				.getForEntity(new URL("http://localhost:" + port + "/employee/id/1").toString(), Company.class);
		assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
	}
	
	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Validate that response is 201")
	public void httpStatusIsCreated() {
		assertFalse(true);
	}
}
