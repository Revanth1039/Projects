package com.example.demo.queryapi.projection;

import java.util.List;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.command.Entity.Product;
import com.example.demo.command.repo.ProductRepo;
import com.example.demo.queryapi.queries.GetProductByName;
import com.example.demo.queryapi.queries.GetProductsQuery;



@Component
public class QueryProjection {
	
	@Autowired
	private ProductRepo pr;
	
	
	@QueryHandler
	public List<Product> handle1(GetProductsQuery gpq) {
		return pr.findAll();
	}
	@QueryHandler
	public List<Product> handle2(GetProductByName gpq) {
		return pr.findByName(gpq.getName());
	}
}
