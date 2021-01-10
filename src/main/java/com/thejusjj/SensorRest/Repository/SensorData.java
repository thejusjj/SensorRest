package com.thejusjj.SensorRest.Repository;

import java.awt.Point;
import java.time.Instant;
import java.util.Date;

public class SensorData {

	private String sensorDataId;
	private String sensorId;
	private Double sensorData;
	private Instant timestamp;
	private String sensorDistrict;
	
	public String getSensorDataId() {
		return sensorDataId;
	}
	public void setSensorDataId(String sensorDataId) {
		this.sensorDataId = sensorDataId;
	}
	public String getSensorId() {
		return sensorId;
	}
	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}
	public Double getSensorData() {
		return sensorData;
	}
	public void setSensorData(Double sensorData) {
		this.sensorData = sensorData;
	}
	public Instant getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}
	public String getSensorDistrict() {
		return sensorDistrict;
	}
	public void setSensorDistrict(String sensorDistrict) {
		this.sensorDistrict = sensorDistrict;
	}
	
	
}
