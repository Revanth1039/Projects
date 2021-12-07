package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.service.UserService;
import com.example.demo.util.JwtUtil;
@Component
public class JwtFilter extends OncePerRequestFilter{

	
	@Autowired
	private UserService us;
	@Autowired
	private JwtUtil ju;
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		final String auth=request.getHeader("Authorization");
		String uname=null;
		String jwt=null;
		if(auth!=null && auth.startsWith("Bearer ")) {
			jwt=auth.substring(7);
			uname=ju.extractUsername(jwt);
		}
		if(uname!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails ud=us.loadUserByUsername(uname);
			if(ju.validateToken(jwt, ud)) {
				UsernamePasswordAuthenticationToken upat=new UsernamePasswordAuthenticationToken(ud,null,ud.getAuthorities());
				upat.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(upat);
			}
		}
		chain.doFilter(request, response);
		
				
		
	}

	
}
