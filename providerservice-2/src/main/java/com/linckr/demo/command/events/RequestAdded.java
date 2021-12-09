package com.linckr.demo.command.events;

import java.util.ArrayList;

public class RequestAdded {
	private String providerId;
    private String providerName;
    private String requestId;
    private String requestedDate;
    private ArrayList<String> requestedInformation;
    private String consumerLink;
    private String fetchKey;
	public RequestAdded() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestAdded(String providerId, String providerName, String requestId, String requestedDate,
			ArrayList<String> requestedInformation, String consumerLink, String fetchKey) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
		this.requestId = requestId;
		this.requestedDate = requestedDate;
		this.requestedInformation = requestedInformation;
		this.consumerLink = consumerLink;
		this.fetchKey = fetchKey;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(String requestedDate) {
		this.requestedDate = requestedDate;
	}
	public ArrayList<String> getRequestedInformation() {
		return requestedInformation;
	}
	public void setRequestedInformation(ArrayList<String> requestedInformation) {
		this.requestedInformation = requestedInformation;
	}
	public String getConsumerLink() {
		return consumerLink;
	}
	public void setConsumerLink(String consumerLink) {
		this.consumerLink = consumerLink;
	}
	public String getFetchKey() {
		return fetchKey;
	}
	public void setFetchKey(String fetchKey) {
		this.fetchKey = fetchKey;
	}
    

}
