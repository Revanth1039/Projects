package com.example.demo.model;

public class Provider {
	

	private String providerId;
	private String providerName,orgId,orgName;
	public Provider(String providerId, String providerName, String orgId, String orgName) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
		this.orgId = orgId;
		this.orgName = orgName;
	}
	
	
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	

}
