package com.thejusjj.SensorRest.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DistrictRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<District> findDistricts(String cityId){

		if(cityId != null) {
			String sql = String.format("select district.district_id,district.district_name,city.city_name as city from district INNER JOIN city ON district.city = city.city_id where city.city_id = '%s'",cityId);

			List<District> districts = jdbcTemplate.query(
					sql,
					new DistrictRowMapper());
			return districts;
		}
		else {
			String sql = String.format("select district.district_id,district.district_name,city.city_name as city from district INNER JOIN city ON district.city = city.city_id");

			List<District> districts = jdbcTemplate.query(
					sql,
					new DistrictRowMapper());
			return districts;
		}
	}



}
