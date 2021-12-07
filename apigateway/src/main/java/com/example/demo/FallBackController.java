package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	
	@GetMapping("/providerFallBack")
	public String fallPro() {
		return "provider service is not found";
	}
	
	
	@GetMapping("/consumerFallBack")
	public String fallCons() {
		return "consumer service is not found";
	}
	
	

}
