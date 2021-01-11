package com.thejusjj.SensorRest.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.thejusjj.SensorRest.Entity.City;
import com.thejusjj.SensorRest.Entity.CityRowMapper;

@Repository
public class CityRepository {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int save(City city) {
		return jdbcTemplate.update("insert into city(city_id,city_name) values(?,?)",UUID.randomUUID().toString(),city.getCityName());
	}

	public List<City> findAll(){
		String sql = "select * from city";

		return jdbcTemplate.query(
				sql,
				new CityRowMapper());
	}
}
