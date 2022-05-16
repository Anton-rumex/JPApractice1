package com.work1.app1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class App1ApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testRestTemplate;
	@Test
	private void checkString(){
		assertEquals("Hello World",
				testRestTemplate.getForObject("http://localhost:" + port + "/",
						String.class));
	}


	@Test
	void contextLoads() {

	}



}

