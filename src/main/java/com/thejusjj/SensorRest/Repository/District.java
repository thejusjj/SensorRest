package com.thejusjj.SensorRest.Repository;

public class District {

	private String districtId;
	private String districtName;
	private String city;
	
	public District() {

	}

	public District(String districtId, String districtName) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
	}

	public District(String districtId, String districtName, String city) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.city = city;
	}
	
	
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
