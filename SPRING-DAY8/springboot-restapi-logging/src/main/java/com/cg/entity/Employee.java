package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	int eid;
	String name;
	
    public Employee() {
	// TODO Auto-generated constructor stub
    }
	
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
	
	

}
