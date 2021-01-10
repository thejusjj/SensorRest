package com.thejusjj.SensorRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thejusjj.SensorRest.Repository.CityRepository;
import com.thejusjj.SensorRest.Repository.DistrictRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SensorRestApplication implements CommandLineRunner{

		
	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(SensorRestApplication.class);
//				SpringApplication.run(SensorRestApplication.class, args);
		sa.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	}

	
	
	
}
