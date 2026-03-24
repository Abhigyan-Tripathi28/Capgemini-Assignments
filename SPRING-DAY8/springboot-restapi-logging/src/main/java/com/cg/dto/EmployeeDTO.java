package com.cg.dto;

public class EmployeeDTO {
	
	int eid;
	String name;
	
	public EmployeeDTO(int eid, String name) {
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
