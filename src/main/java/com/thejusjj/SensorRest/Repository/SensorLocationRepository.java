package com.thejusjj.SensorRest.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SensorLocationRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<SensorLocation> findAllSensors(String districtId, String cityId){

		if(districtId!= null && cityId != null) {
			String sql = String.format("select sensor_location.sensor_id,sensor_location.sensor_location,sensor_location.sensor_status, sensor_location.date_installation,district.district_name as district, city.city_name as city from sensor_location INNER JOIN district ON sensor_location.sensor_district = district.district_id INNER JOIN city on district.city = city.city_id where district.district_id = '%s' AND city.city_id = '%s'",districtId,cityId);
			List<SensorLocation> sensorLocations = jdbcTemplate.query(
					sql,
					new SensorLocationRowMapper());
			return sensorLocations;
		}
		else if(districtId!= null) {
			String sql = String.format("select sensor_location.sensor_id,sensor_location.sensor_location,sensor_location.sensor_status, sensor_location.date_installation,district.district_name as district, city.city_name as city from sensor_location INNER JOIN district ON sensor_location.sensor_district = district.district_id INNER JOIN city on district.city = city.city_id where district.district_id = '%s'",districtId);
			List<SensorLocation> sensorLocations = jdbcTemplate.query(
					sql,
					new SensorLocationRowMapper());
			return sensorLocations;
		}
		else if(cityId!= null) {
			String sql = String.format("select sensor_location.sensor_id,sensor_location.sensor_location,sensor_location.sensor_status, sensor_location.date_installation,district.district_name as district, city.city_name as city from sensor_location INNER JOIN district ON sensor_location.sensor_district = district.district_id INNER JOIN city on district.city = city.city_id where city.city_id = '%s'",cityId);
			List<SensorLocation> sensorLocations = jdbcTemplate.query(
					sql,
					new SensorLocationRowMapper());
			return sensorLocations;
		}
		else {
			String sql = "select sensor_location.sensor_id,sensor_location.sensor_location,sensor_location.sensor_status, sensor_location.date_installation,district.district_name as district, city.city_name as city from sensor_location INNER JOIN district ON sensor_location.sensor_district = district.district_id INNER JOIN city on district.city = city.city_id";
			List<SensorLocation> sensorLocations = jdbcTemplate.query(
					sql,
					new SensorLocationRowMapper());
			return sensorLocations;
		}
		
	}

}
