package com.thejusjj.SensorRest.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CityRowMapper implements RowMapper<City>{

	@Override
	public City mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		City city = new City();
		city.setCityId(rs.getString("city_id"));
		city.setCityName(rs.getString("city_name"));
		
		return city;
	}

}
