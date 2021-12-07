package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.authenticate.AuthenticateReq;
import com.example.demo.authenticate.JwtAuthenticate;
import com.example.demo.service.UserService;
import com.example.demo.util.JwtUtil;

@RestController
public class HomeController {
	@Autowired
	private AuthenticationManager am;
	@Autowired
	private UserService userservice;
	@Autowired
	private JwtUtil ju;
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
      public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticateReq ar) throws Exception{
		try {
			am.authenticate(new UsernamePasswordAuthenticationToken(ar.getName(),ar.getPassword()));
			
		}
		catch(Exception e) {
			throw new Exception("Incorrect Credentials");
		}
		final UserDetails us=userservice.loadUserByUsername(ar.getName());
		final String jwt=ju.generateToken(us);
		return ResponseEntity.ok(new JwtAuthenticate(jwt));
		
	}
}
