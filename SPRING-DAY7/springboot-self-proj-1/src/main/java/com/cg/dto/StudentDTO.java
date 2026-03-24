package com.cg.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class StudentDTO {
	
	private int id;
	
	@NotBlank(message="name should not be empty")
	private String name;
	
	@Email(message="invalid email foramt")
	@NotBlank(message="email should not be empty")
	private String email;
	
	public StudentDTO(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
