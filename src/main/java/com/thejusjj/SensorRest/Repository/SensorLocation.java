package com.thejusjj.SensorRest.Repository;

import java.awt.Point;
import java.util.Date;

public class SensorLocation {
	
	private String sensorId;
	private Point sensorLocation;
	private String sensorStatus;
	private Date dateInstallation;
	private String sensorDistrict;
	private String sensorCity;
	
	
	public String getSensorId() {
		return sensorId;
	}
	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}
	public Point getSensorLocation() {
		return sensorLocation;
	}
	public void setSensorLocation(Point sensorLocation) {
		this.sensorLocation = sensorLocation;
	}
	public String getSensorStatus() {
		return sensorStatus;
	}
	public void setSensorStatus(String sensorStatus) {
		this.sensorStatus = sensorStatus;
	}
	public Date getDateInstallation() {
		return dateInstallation;
	}
	public void setDateInstallation(Date dateInstallation) {
		this.dateInstallation = dateInstallation;
	}
	public String getSensorDistrict() {
		return sensorDistrict;
	}
	public void setSensorDistrict(String sensorDistrict) {
		this.sensorDistrict = sensorDistrict;
	}
	public String getSensorCity() {
		return sensorCity;
	}
	public void setSensorCity(String sensorCity) {
		this.sensorCity = sensorCity;
	}
	
	
	

}
