package com.thejusjj.SensorRest.Controller;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thejusjj.SensorRest.Repository.City;
import com.thejusjj.SensorRest.Repository.CityRepository;
import com.thejusjj.SensorRest.Repository.District;
import com.thejusjj.SensorRest.Repository.DistrictRepository;
import com.thejusjj.SensorRest.Repository.SensorData;
import com.thejusjj.SensorRest.Repository.SensorDataRepository;
import com.thejusjj.SensorRest.Repository.SensorLocation;
import com.thejusjj.SensorRest.Repository.SensorLocationRepository;

@Validated
@RestController
public class SensorController {
	
	@Autowired 
	CityRepository cityRepository;

	@Autowired
	private DistrictRepository districtRepository;
	
	@Autowired
	private SensorLocationRepository sensorLocationRepository;
	
	@Autowired
	private SensorDataRepository sensorDataRepository;

	@RequestMapping(value="/v1/cities",method = RequestMethod.GET)
	public List<City> getAllCities(){
		return cityRepository.findCities();
	}
	
	@RequestMapping(value="/v1/cities/{city_id}/districts",method = RequestMethod.GET)
	public List<District> getDistrictsInCity(String cityId){
		return districtRepository.findDistricts(cityId);
	}
	
	@RequestMapping(value="/v1/sensors",method = RequestMethod.POST)
	public List<City> createNewSensor(String sensorId,Float data){
		//to change
		return cityRepository.findCities();
	}
	
	@RequestMapping(value="/v1/sensors",method = RequestMethod.GET)
	public List<SensorLocation> getSensor(String districtId,String cityId){
		return sensorLocationRepository.findAllSensors(districtId, cityId);
	}
	
	
	@RequestMapping(value="/v1/sensordata",method = RequestMethod.POST)
	public int createNewSensorData(String sensorId,Double dataValue){
		return sensorDataRepository.createNewSensorData(sensorId,dataValue);
	}
	
	@RequestMapping(value="/v1/sensordata",method = RequestMethod.GET)
	public List<SensorData> getSensorData(@NotNull @NotBlank String cityId,String districtId,Integer daySpan ,Date fromDate, Date tillDate){
		return sensorDataRepository.findAllSensorData(cityId,districtId,daySpan,fromDate, tillDate);
	}
	

	
}
