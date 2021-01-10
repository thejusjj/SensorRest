package com.thejusjj.SensorRest.Service;

import java.util.Date;
import java.util.List;

import com.thejusjj.SensorRest.Entity.SensorData;

public interface ISensorDataService {

	public List<SensorData> findAllSensorData(String cityId,String districtId,Integer daySpan,Date fromDate, Date tillDate);
	
	public int createNewSensorData(String sensorId, Double sensorData);
}
