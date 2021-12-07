package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		return "home";
	}
	
	@GetMapping("/user")
    public ResponseEntity<String> usesrPage(){ return ResponseEntity.ok("From the userPage"); }

    @GetMapping("/admin")
    public ResponseEntity<String> adminPage(){ return ResponseEntity.ok("From the adminPage"); }

}
