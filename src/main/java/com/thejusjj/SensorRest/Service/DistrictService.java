package com.thejusjj.SensorRest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thejusjj.SensorRest.Entity.District;
import com.thejusjj.SensorRest.Entity.DistrictRowMapper;
import com.thejusjj.SensorRest.Repository.DistrictRepository;

@Service
public class DistrictService implements IDistrictService{

	@Autowired
	private DistrictRepository districtRepository;
	
	@Override
	public List<District> findDistricts(String cityId) {
		if(cityId != null) {
			return districtRepository.findAllDistrictsInCity(cityId);
		}
		else {
			return districtRepository.findAll();
		}
	}

}
