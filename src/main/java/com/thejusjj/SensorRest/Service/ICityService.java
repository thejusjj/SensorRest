package com.thejusjj.SensorRest.Service;

import java.util.List;

import com.thejusjj.SensorRest.Entity.City;

public interface ICityService {

	public int createNewCity(City city);
	
	public List<City> findAllCities();
	
}
