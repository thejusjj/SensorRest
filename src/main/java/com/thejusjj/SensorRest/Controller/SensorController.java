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

import com.thejusjj.SensorRest.Entity.City;
import com.thejusjj.SensorRest.Entity.District;
import com.thejusjj.SensorRest.Entity.SensorData;
import com.thejusjj.SensorRest.Entity.SensorLocation;
import com.thejusjj.SensorRest.Service.ICityService;
import com.thejusjj.SensorRest.Service.IDistrictService;
import com.thejusjj.SensorRest.Service.ISensorDataService;
import com.thejusjj.SensorRest.Service.ISensorLocationService;

@Validated
@RestController
public class SensorController {
	
	@Autowired
	private ICityService cityService;

	@Autowired
	private IDistrictService districtService;
	
	@Autowired
	private ISensorLocationService sensorLocationService;
	
	@Autowired
	private ISensorDataService sensorDataService;

	@RequestMapping(value="/v1/cities",method = RequestMethod.GET)
	public List<City> getAllCities(){
		return cityService.findAllCities();
	}
	
	@RequestMapping(value="/v1/cities/{city_id}/districts",method = RequestMethod.GET)
	public List<District> getDistrictsInCity(String cityId){
		return districtService.findDistricts(cityId);
	}
	
	@RequestMapping(value="/v1/sensors",method = RequestMethod.POST)
	public List<City> createNewSensor(String sensorId,Float data){
		//to change
		return cityService.findAllCities();
	}
	
	@RequestMapping(value="/v1/sensors",method = RequestMethod.GET)
	public List<SensorLocation> getSensor(String districtId,String cityId){
		return sensorLocationService.findAllSensors(districtId, cityId);
	}
	
	
	@RequestMapping(value="/v1/sensordata",method = RequestMethod.POST)
	public int createNewSensorData(String sensorId,Double dataValue){
		return sensorDataService.createNewSensorData(sensorId,dataValue);
	}
	
	@RequestMapping(value="/v1/sensordata",method = RequestMethod.GET)
	public List<SensorData> getSensorData(String cityId,String districtId,Integer daySpan ,Date fromDate, Date tillDate){
		return sensorDataService.findAllSensorData(cityId,districtId,daySpan,fromDate, tillDate);
	}
	

	
}
