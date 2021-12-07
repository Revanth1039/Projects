package com.example.demo.command.controller;

import java.util.UUID;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.command.CreateProductCommand;
import com.example.demo.command.model.ProductModel;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	
	@Autowired
	private CommandGateway commandGateway;

    public ProductController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody ProductModel productModel) {
        CreateProductCommand createProductCommand =new 
        CreateProductCommand(UUID.randomUUID().toString(),productModel.getName(),productModel.getPrice(),productModel.getQuantity());        
        String result = commandGateway.sendAndWait(createProductCommand);
        return result;
    }
	   
	    
}
