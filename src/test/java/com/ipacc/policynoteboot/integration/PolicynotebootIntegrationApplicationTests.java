package com.ipacc.policynoteboot.integration;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class PolicynotebootIntegrationApplicationTests {

	@Value("${serverUrl}")
	private String serverUrl;

	@Test
	public void contextLoads() {
	}

	@Test
	public void health_is_good() {
		String url = this.serverUrl + "/health";

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);

		System.out.println(response);
		assertNotNull(response);

	}

}
