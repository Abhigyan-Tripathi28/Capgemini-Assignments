package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private int eid;
	private String name;
	
	@Autowired
	@Qualifier("add1") // for selecting a specific one
	private Address address;
	
	
//	public Employee(int eid, String name, Address address) {
//		super();
//		this.eid = eid;
//		this.name = name;
//		this.address = address;
//	}
	
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
		
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
    public void emp_details() {
    	
    	System.out.println(eid);
    	System.out.println(name);
    	System.out.println(address.getCity());
    	System.out.println(address.getZip());
    
    }
	

}
