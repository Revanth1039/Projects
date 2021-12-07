package com.example.demo.command.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private String productId;
	private String name,quantity,price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productId, String name, String quantity, String price) {
		super();
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
	

}
