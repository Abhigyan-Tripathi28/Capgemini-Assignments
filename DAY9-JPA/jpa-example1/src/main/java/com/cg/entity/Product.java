package com.cg.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="product_table")
//@Data
@ToString
public class Product {
	
	@Id
	private int pid;
	private String name;
	private int qty;
	private int price;
	private LocalDate mfd;
	

}
