package com.thejusjj.SensorRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
public class RequestTest {

	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
//	@Test
//	public void cityShoudlReturnGlobalCities() throws Exception{
//		
//	}
}
