package com.thejusjj.SensorRest.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SensorLocationRowMapper implements RowMapper<SensorLocation> {

	@Override
	public SensorLocation mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		SensorLocation sensorLocation = new SensorLocation();
		sensorLocation.setSensorId(rs.getString("sensor_id"));
//		sensorLocation.setSensorId(rs.get("sensor_location"));
		sensorLocation.setSensorStatus(rs.getString("sensor_status"));
		sensorLocation.setDateInstallation(rs.getDate("date_installation"));
		sensorLocation.setSensorDistrict(rs.getString("district"));
		sensorLocation.setSensorCity(rs.getString("city"));
		return sensorLocation;
	}

}
