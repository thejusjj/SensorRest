package com.thejusjj.SensorRest.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.thejusjj.SensorRest.Entity.District;
import com.thejusjj.SensorRest.Entity.DistrictRowMapper;

@Repository
public class DistrictRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<District> findAll(){
		String sql = String.format("select district.district_id,district.district_name,city.city_name as city from district INNER JOIN city ON district.city = city.city_id");

		return jdbcTemplate.query(
				sql,
				new DistrictRowMapper());
	}
	
	public List<District> findAllDistrictsInCity(String cityId){
		String sql = String.format("select district.district_id,district.district_name,city.city_name as city from district INNER JOIN city ON district.city = city.city_id where city.city_id = '%s'",cityId);

		return jdbcTemplate.query(
				sql,
				new DistrictRowMapper());
	}

}
