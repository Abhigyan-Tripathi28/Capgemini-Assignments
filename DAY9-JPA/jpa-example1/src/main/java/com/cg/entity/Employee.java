package com.cg.entity;

import java.time.LocalDate;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity                                                                                                               
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  //JOINED & SINGLE_TABLE - better
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empid;
	private String name;
	private LocalDate dob;
	
//	public Employee(int empid, String name, LocalDate dob) {
//		super();
//		this.empid = empid;
//		this.name = name;
//		this.dob = dob;
//	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	
	
	

}
