package com.thejusjj.SensorRest.Service;

import java.util.List;

import com.thejusjj.SensorRest.Entity.District;

public interface IDistrictService {

	public List<District> findDistricts(String cityId);
}
