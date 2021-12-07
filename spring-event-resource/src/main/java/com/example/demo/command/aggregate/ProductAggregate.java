package com.example.demo.command.aggregate;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.stereotype.Component;

import com.example.demo.command.CreateProductCommand;
import com.example.demo.command.events.ProductCreated;

@Aggregate

public class ProductAggregate {
	
	@AggregateIdentifier
    private String productId;
    private String name,price,quantity;
    
    @CommandHandler
	public ProductAggregate(CreateProductCommand cpc) {
		ProductCreated pc=new ProductCreated(cpc.getProductId(),cpc.getName(),cpc.getPrice(),cpc.getQuantity());
		AggregateLifecycle.apply(pc);
		
		// TODO Auto-generated constructor stub
	}
	@EventSourcingHandler
	public void on(ProductCreated pc) {
		this.productId=pc.getProductId();
		this.name=pc.getName();
		this.price=pc.getPrice();
		this.quantity=pc.getQuantity();
	}
	public ProductAggregate() {
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
