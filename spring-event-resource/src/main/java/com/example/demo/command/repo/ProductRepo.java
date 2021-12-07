package com.example.demo.command.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.command.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, String> {

	List<Product> findByName(String name);

}
