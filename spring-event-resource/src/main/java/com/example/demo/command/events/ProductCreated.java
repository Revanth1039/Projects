package com.example.demo.command.events;



public class ProductCreated {
	

    private String productId;
    private String name,price,quantity;
	public ProductCreated(String productId, String name, String price, String quantity) {

		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public ProductCreated() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
    
    

}
