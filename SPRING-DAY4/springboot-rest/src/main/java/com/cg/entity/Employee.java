package com.cg.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int eid;
	private String name;
	private LocalDate dob;
	private double sal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int eid, String name, LocalDate dob, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.dob = dob;
		this.sal = sal;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

}
