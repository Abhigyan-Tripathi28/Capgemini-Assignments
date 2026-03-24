package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LoginDetails")
public class UserBean {
	
	@Id
	String userID;
	String pass;
	String role;
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public UserBean(String userID, String pass, String role) {
		super();
		this.userID = userID;
		this.pass = pass;
		this.role = role;
	}



	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
