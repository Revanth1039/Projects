package com.example.demo.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApiModel {
	@Id
	 private String providerId;
    private String providerName;
    private String OrgName;
    private String OrgId;
    private String requestId;
    private String requestedDate;
    private ArrayList<String> requestedInformation;
    private String consumerLink;
    private String fetchKey;
	
	
	public ApiModel(String providerId, String providerName, String orgName, String orgId, String requestId,String requestedDate, ArrayList<String> requestedInformation, String consumerLink, String fetchKey) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
		OrgName = orgName;
		OrgId = orgId;
		this.requestId = requestId;
		this.requestedDate = requestedDate;
		this.requestedInformation = requestedInformation;
		this.consumerLink = consumerLink;
		this.fetchKey = fetchKey;
	}
	

	public ApiModel() {
		super();
	}
	
	

	public String getOrgName() {
		return OrgName;
	}


	public void setOrgName(String orgName) {
		OrgName = orgName;
	}


	public String getOrgId() {
		return OrgId;
	}


	public void setOrgId(String orgId) {
		OrgId = orgId;
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
	public ArrayList<String> getRequestedInformation() {
		return requestedInformation;
	}
	public void setRequestedInformation(ArrayList<String> requestedInformation) {
		this.requestedInformation = requestedInformation;
	}
    
    
    

}
