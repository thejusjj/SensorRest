package com.thejusjj.SensorRest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejusjj.SensorRest.Controller.SensorController;

@SpringBootTest
public class SmokeTests {

	@Autowired
	private SensorController controller;
	
	@Test
	public void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}
}
