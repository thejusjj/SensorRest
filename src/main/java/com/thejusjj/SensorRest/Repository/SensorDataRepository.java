package com.thejusjj.SensorRest.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.thejusjj.SensorRest.Entity.SensorData;
import com.thejusjj.SensorRest.Entity.SensorDataRowMapper;

@Repository
public class SensorDataRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<SensorData> findAllSensorDataInCity(String cityId,String districtId,int daySpan,Date fromDate, Date tillDate){

		String sql = String.format("select sensor_data.sensor_data_id,sensor_data.sensor_id,sensor_data.data_value, sensor_data.timestamp,district.district_name as district from sensor_data INNER JOIN sensor_location ON sensor_data.sensor_id = sensor_location.sensor_id INNER JOIN district on district.district_id = sensor_location.sensor_district INNER JOIN city on district.city = city.city_id where city.city_id = '%s'",cityId);
		List<SensorData> sensorData = jdbcTemplate.query(
				sql,
				new SensorDataRowMapper());
		return sensorData;
	
	}
	
//	if(cityId != null) {
//	String sql = String.format("select sensor_data.sensor_data_id,sensor_data.sensor_id,sensor_data.data_value, sensor_data.timestamp,district.district_name as district from sensor_data INNER JOIN sensor_location ON sensor_data.sensor_id = sensor_location.sensor_id INNER JOIN district on district.district_id = sensor_location.sensor_district INNER JOIN city on district.city = city.city_id where city.city_id = '%s'",cityId);
//	List<SensorData> sensorData = jdbcTemplate.query(
//			sql,
//			new SensorDataRowMapper());
//	return sensorData;
//}
	
	public int createNewSensorData(String sensorId, Double sensorData) {
		
		return jdbcTemplate.update("insert into sensor_data(sensor_data_id,sensor_id,data_value,timestamp) values(?,?,?,?)",UUID.randomUUID().toString(),sensorId,sensorData,Timestamp.from(Instant.now()));
	}
}
