package com.thejusjj.SensorRest.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thejusjj.SensorRest.Entity.SensorData;
import com.thejusjj.SensorRest.Repository.SensorDataRepository;

@Service
public class SensorDataService implements ISensorDataService{

	@Autowired
	private SensorDataRepository sensorDataRepository;
	
	@Override
	public List<SensorData> findAllSensorData(String cityId, String districtId, Integer daySpan, Date fromDate,
			Date tillDate) {
		if(cityId != null) {
			return sensorDataRepository.findAllSensorDataInCity(cityId, districtId, daySpan == null ? 0:daySpan, fromDate, tillDate);
		} 
		else {
			return new ArrayList<SensorData>();
		}
	}

	@Override
	public int createNewSensorData(String sensorId, Double sensorData) {
		
		return sensorDataRepository.createNewSensorData(sensorId, sensorData);
	}

}
