package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApiModel;
//import com.example.demo.repo.ApiRepo;
import com.example.demo.service.ApiService;

@RestController
@RequestMapping(path = "/linckr")
public class APIController {
	@Autowired
	private ApiService as;
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<ApiModel> getProviderById(@PathVariable("id") String id){
		ApiModel am=as.getProviderById(id);
		return ResponseEntity.ok(am);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<ApiModel>> getAll(){
		List<ApiModel> array= as.getAll();
		return ResponseEntity.ok(array);
	}
	
	@PostMapping("/add")
	public ResponseEntity<ApiModel> add(@RequestBody ApiModel am){
		as.add(am);
		return ResponseEntity.ok(am);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ApiModel> update(@RequestBody ApiModel am){
		as.add(am);
		return ResponseEntity.ok(am);
	}
	
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<ApiModel> deleteByProviderId(@PathVariable("id") String id){
		ApiModel am=as.deleteByProviderId(id);
		return ResponseEntity.ok(am);
	}
	
	
	
	
	

}
