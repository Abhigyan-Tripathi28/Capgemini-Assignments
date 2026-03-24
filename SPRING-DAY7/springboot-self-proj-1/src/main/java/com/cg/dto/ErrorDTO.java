package com.cg.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorDTO {
	
	private String message;
	
	@JsonFormat(pattern = "dd-MMM-yyyy")
	private LocalDate now;
	private String uri;
	
	public ErrorDTO() {
		// TODO Auto-generated constructor stub
	}

	public ErrorDTO(String message, LocalDate now, String uri) {
		super();
		this.message = message;
		this.now = now;
		this.uri = uri;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getNow() {
		return now;
	}

	public void setNow(LocalDate now) {
		this.now = now;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	

}
