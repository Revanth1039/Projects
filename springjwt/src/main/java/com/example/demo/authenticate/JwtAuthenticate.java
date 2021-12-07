package com.example.demo.authenticate;

public class JwtAuthenticate {
	
	private String jwt;

	public JwtAuthenticate(String jwt) {
		super();
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	

}
