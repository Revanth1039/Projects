package com.example.demo.authenticate;



public class AuthenticateReq {
	private String name,password;

	public AuthenticateReq() {
		super();
	}

	public AuthenticateReq(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
