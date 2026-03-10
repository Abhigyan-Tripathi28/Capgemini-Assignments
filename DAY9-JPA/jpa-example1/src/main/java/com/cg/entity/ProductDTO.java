package com.cg.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {
	
	private String name;
	private int price;
	private LocalDate mfd;
	
//	public ProductDTO(String name, int price, LocalDate mfd) {
//		super();
//		this.name = name;
//		this.price = price;
//		this.mfd = mfd;
//	}
	
	
	
	

}
