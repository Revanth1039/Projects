package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Provider;
import com.example.demo.providerrepo.ProviderRepo;

@RestController
@RequestMapping("/providers")
public class ProviderController {
	@Autowired
	private ProviderRepo pr;
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Provider>> getAll(){
		return ResponseEntity.ok(pr.findAll());
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<Provider> getById(@PathVariable("id") String id){
		return ResponseEntity.ok(pr.findByProviderId(id));
	}
	
	@PostMapping("/add")
	public ResponseEntity<Provider> add(@RequestBody Provider p){
		pr.save(p);
		return ResponseEntity.ok(p);
	}

}
