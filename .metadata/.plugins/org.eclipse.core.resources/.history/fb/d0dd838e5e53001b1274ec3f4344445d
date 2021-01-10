package com.thejusjj.SensorRest.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CityRepository {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int save(City city) {
		return jdbcTemplate.update("insert into city(city_id,city_name) values(?,?)",UUID.randomUUID().toString(),city.getCityName());
	}

	public List<City> findCities(){

		String sql = "select * from city";

//		List<City> cities = new ArrayList<City>();

		List<City> cities = jdbcTemplate.query(
				sql,
				new CityRowMapper());


//		try {
//			jdbcTemplate.queryForList(sql).forEach(row -> cities.add(new City((String)row.get("city_id"),(String)row.get("city_name"))));;
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
		return cities;
	}
}
