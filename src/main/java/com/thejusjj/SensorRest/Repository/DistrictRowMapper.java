package com.thejusjj.SensorRest.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class DistrictRowMapper implements RowMapper<District>{

	@Override
	public District mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		District district = new District();
		district.setDistrictId(rs.getString("district_id"));
		district.setDistrictName(rs.getString("district_name"));
		district.setCity(rs.getString("city"));
		return district;
	}
}
