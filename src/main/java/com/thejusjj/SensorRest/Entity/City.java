package com.thejusjj.SensorRest.Entity;

public class City {

	private String cityId;
	private String cityName;
	
	public City() {
		
	}
	
	public City(String cityId,String cityName) {
		this.cityId = cityId;
		this.cityName = cityName;
	}
	
	@Override
	public String toString() {return "Customer{" +
            "cityId=" + cityId +
            ", cityName='" + cityName +
            '}';
}
	
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	
}
