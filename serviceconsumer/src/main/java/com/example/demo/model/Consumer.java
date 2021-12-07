package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consumer {
	
	@Id
	private String consumerId;
	private String consumerName,requestedInfo,providerId;
	public Consumer(String consumerId, String consumerName, String requestedInfo, String providerId) {
		super();
		this.consumerId = consumerId;
		this.consumerName = consumerName;
		this.requestedInfo = requestedInfo;
		this.providerId = providerId;
	}
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getRequestedInfo() {
		return requestedInfo;
	}
	public void setRequestedInfo(String requestedInfo) {
		this.requestedInfo = requestedInfo;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	

}
