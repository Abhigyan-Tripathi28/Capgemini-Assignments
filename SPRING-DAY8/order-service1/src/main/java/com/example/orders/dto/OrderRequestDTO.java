package com.example.orders.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class OrderRequestDTO {
	
	@NotBlank(message="cname not to be empty")
	@Size(min=3)
	private String customerName;
	
	@NotBlank(message="email not to be empty")
	@Email
    private String email;
	
	@NotBlank(message="pname not to be empty")
    private String productName;
	
	@NotNull(message="qty not to be empty")
	@Min(value=1)
    private Integer quantity;
	
	@NotNull(message="ppu not to be empty")
	@Min(value=1)
    private Double pricePerUnit;
    
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
    
    

}
