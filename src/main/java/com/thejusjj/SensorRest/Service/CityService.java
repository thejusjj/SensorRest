package com.thejusjj.SensorRest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thejusjj.SensorRest.Entity.City;
import com.thejusjj.SensorRest.Repository.CityRepository;

@Service
public class CityService implements ICityService{

	@Autowired 
	CityRepository cityRepository;
	
	@Override
	public int createNewCity(City city) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<City> findAllCities() {
		return cityRepository.findAll();
	}

}
