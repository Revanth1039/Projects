package com.example.demo.VO;

import com.example.demo.model.Consumer;
import com.example.demo.model.Provider;

public class ConsumerProvider {
	
	private Consumer c;
	private Provider p;
	public ConsumerProvider(Consumer c, Provider p) {
		super();
		this.c = c;
		this.p = p;
	}
	
	public ConsumerProvider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consumer getC() {
		return c;
	}
	public void setC(Consumer c) {
		this.c = c;
	}
	public Provider getP() {
		return p;
	}
	public void setP(Provider p) {
		this.p = p;
	}
	

}
