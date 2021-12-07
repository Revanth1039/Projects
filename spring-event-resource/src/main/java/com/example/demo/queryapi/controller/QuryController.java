package com.example.demo.queryapi.controller;
import com.example.demo.command.Entity.Product;
import com.example.demo.command.model.ProductModel;

import java.util.List;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.queryapi.queries.GetProductByName;
import com.example.demo.queryapi.queries.GetProductsQuery;

@RequestMapping("/products")
@RestController
public class QuryController {
	@Autowired
	private QueryGateway wg;
	
	
	
	
	@GetMapping("/getAll")
	public List<Product> getAll(){
		GetProductsQuery gpq=new GetProductsQuery();
		List<Product> lp=wg.query(gpq, ResponseTypes.multipleInstancesOf(Product.class)).join();
		return lp;	
		
	}
	
	@GetMapping("/getByName/{name}")
	public List<Product> getAll(@PathVariable("name") String name){
		GetProductByName gpq=new GetProductByName(name);
		List<Product> lp=wg.query(gpq, ResponseTypes.multipleInstancesOf(Product.class)).join();
		return lp;	
		
	}
	
	
	

}
