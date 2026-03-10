package com.cg.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity                      //look for the table(Product) in configured db(Employee)
public class Product {
	
	@Id                       // indicates this particular attribute is primary key
	private int pid;
	private String name;
	private double price;
	
//	@Transient                   // to skip anything -even after giving value in main ,it doesn't add it to db
	private int qty;
	private LocalDate dom;
	
	public Product() {}
	
	public Product(int pid, String name, double price, int qty, LocalDate dom) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.dom = dom;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public LocalDate getDom() {
		return dom;
	}
	public void setDom(LocalDate dom) {
		this.dom = dom;
	}
	
	
	

}
