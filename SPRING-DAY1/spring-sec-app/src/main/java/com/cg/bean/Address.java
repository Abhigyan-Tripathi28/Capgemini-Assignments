package com.cg.bean;

public class Address {
	
	private String city;
	private int zip;
	
	
	
	public Address(String city, int zip) {
		super();
		this.city = city;
		this.zip = zip;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	

}
