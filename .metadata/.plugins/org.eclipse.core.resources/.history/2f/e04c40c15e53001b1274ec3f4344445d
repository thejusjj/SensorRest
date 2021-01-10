package com.thejusjj.SensorRest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thejusjj.SensorRest.Entity.SensorLocation;
import com.thejusjj.SensorRest.Repository.SensorLocationRepository;

@Service
public class SensorLocationService implements ISensorLocationService {
	
	@Autowired
	private SensorLocationRepository sensorLocationRepository;
	
	public List<SensorLocation> findAllSensors(String districtId, String cityId){
		
		if(districtId!= null && cityId != null) {
			return sensorLocationRepository.findAllSensorsInCityDistrict(districtId, cityId);
		}
		else if(districtId!= null) {
			return sensorLocationRepository.findAllSensorsInDistrict(districtId);
		}
		else if(cityId!= null) {
			return sensorLocationRepository.findAllSensorsInCity(cityId);
		}
		else {
			return sensorLocationRepository.findAll();
		}
	}

}
