package com.example.demo.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Builder;
import lombok.Data;



@Builder
@Data
public class CreateProductCommand {
	
	@TargetAggregateIdentifier
    private String productId;
    private String name,price,quantity;
	public CreateProductCommand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateProductCommand(String productId, String name, String price, String quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
	public static Object builder() {
		// TODO Auto-generated method stub
		return new CreateProductCommand();
	}
	
    
    

}
