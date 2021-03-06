package com.example.demo.Springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService uds;
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider p=new DaoAuthenticationProvider();
		p.setUserDetailsService(uds);
		p.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return p;
	}
	
	
	

}
