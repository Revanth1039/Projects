package com.example.demo.command.model;

public class ProductModel {

	 private String name,price,quantity;

		

		public ProductModel() {
		super();
		// TODO Auto-generated constructor stub
	}

		public ProductModel(String name, String price, String quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
