package com.thejusjj.SensorRest.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SensorDataRowMapper implements RowMapper<SensorData>{

	@Override
	public SensorData mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		SensorData sensorData = new SensorData();
		sensorData.setSensorDataId(rs.getString("sensor_data_id"));
		sensorData.setSensorId(rs.getString("sensor_id"));
		sensorData.setSensorData(rs.getDouble("data_value"));
		sensorData.setTimestamp(rs.getTimestamp("timestamp").toInstant());
		sensorData.setSensorDistrict(rs.getString("district"));
		return sensorData;
	}

}
