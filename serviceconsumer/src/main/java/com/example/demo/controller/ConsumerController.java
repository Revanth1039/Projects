package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.VO.ConsumerProvider;
import com.example.demo.model.Consumer;
import com.example.demo.model.Provider;
import com.example.demo.repo.ConsumerRepo;

@RestController
@RequestMapping("/consumers")
public class ConsumerController {
	
	@Autowired
	private ConsumerRepo cr;
	@Autowired
	private RestTemplate rt;
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Consumer>> getAll(){
		return ResponseEntity.ok(cr.findAll());
	}
	
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<ConsumerProvider> getById(@PathVariable("id") String id){
		ConsumerProvider cp=new ConsumerProvider();
		Consumer c=cr.findByConsumerId(id);
		Provider p=rt.getForObject("http://provider-service/providers/getById/"+c.getProviderId(), Provider.class);
		cp.setC(c);
		cp.setP(p);
		return ResponseEntity.ok(cp);
	}
	@PostMapping("/add")
	public ResponseEntity<Consumer> add(@RequestBody Consumer c){
		cr.save(c);
		return ResponseEntity.ok(c);
	}

}
