package com.example.demo.command.events;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.command.Entity.Product;
import com.example.demo.command.repo.ProductRepo;

@Component
public class ProductEventHandler {
	
	
	@Autowired
	private ProductRepo pr;
	
	@EventHandler
	public void on(ProductCreated pc) {
		Product p=new Product();
		BeanUtils.copyProperties(pc, p);
		pr.save(p);
		
	}
	

}
