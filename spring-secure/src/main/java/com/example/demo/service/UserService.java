package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.principal.UserPrincipal;
import com.example.demo.userrepo.Userrepo;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private Userrepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User u=repo.findByName(username);
		
		// TODO Auto-generated method stub
		return new UserPrincipal(u);
	}
	
	
	

}
