package com.thejusjj.SensorRest.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.thejusjj.SensorRest.Entity.SensorLocation;
import com.thejusjj.SensorRest.Entity.SensorLocationRowMapper;

@Repository
public class SensorLocationRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<SensorLocation> findAllSensorsInCityDistrict(String districtId, String cityId){
		String sql = String.format("select sensor_location.sensor_id,sensor_location.sensor_location,sensor_location.sensor_status, sensor_location.date_installation,district.district_name as district, city.city_name as city from sensor_location INNER JOIN district ON sensor_location.sensor_district = district.district_id INNER JOIN city on district.city = city.city_id where district.district_id = '%s' AND city.city_id = '%s'",districtId,cityId);
		return jdbcTemplate.query(
				sql,
				new SensorLocationRowMapper());
	}

	public List<SensorLocation> findAllSensorsInDistrict(String districtId){
		String sql = String.format("select sensor_location.sensor_id,sensor_location.sensor_location,sensor_location.sensor_status, sensor_location.date_installation,district.district_name as district, city.city_name as city from sensor_location INNER JOIN district ON sensor_location.sensor_district = district.district_id INNER JOIN city on district.city = city.city_id where district.district_id = '%s'",districtId);
		return jdbcTemplate.query(
				sql,
				new SensorLocationRowMapper());
	}
	public List<SensorLocation> findAllSensorsInCity(String cityId){
		String sql = String.format("select sensor_location.sensor_id,sensor_location.sensor_location,sensor_location.sensor_status, sensor_location.date_installation,district.district_name as district, city.city_name as city from sensor_location INNER JOIN district ON sensor_location.sensor_district = district.district_id INNER JOIN city on district.city = city.city_id where city.city_id = '%s'",cityId);
		return jdbcTemplate.query(
				sql,
				new SensorLocationRowMapper());
	}
	public List<SensorLocation> findAll(){
		String sql = "select sensor_location.sensor_id,sensor_location.sensor_location,sensor_location.sensor_status, sensor_location.date_installation,district.district_name as district, city.city_name as city from sensor_location INNER JOIN district ON sensor_location.sensor_district = district.district_id INNER JOIN city on district.city = city.city_id";
		return jdbcTemplate.query(
				sql,
				new SensorLocationRowMapper());
	}

}
