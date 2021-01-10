package com.thejusjj.SensorRest.Service;

import java.util.List;

import com.thejusjj.SensorRest.Entity.SensorLocation;

public interface ISensorLocationService {

	public List<SensorLocation> findAllSensors(String districtId, String cityId);
}
