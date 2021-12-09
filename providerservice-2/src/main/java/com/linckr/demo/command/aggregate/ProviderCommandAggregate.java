package com.linckr.demo.command.aggregate;

import java.util.ArrayList;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import com.linckr.demo.command.CreateRequestCommand;
import com.linckr.demo.command.events.RequestAdded;


@Aggregate
public class ProviderCommandAggregate {
	
	@AggregateIdentifier
	private String providerId;
    private String providerName;
    private String requestId;
    private String requestedDate;
    private ArrayList<String> requestedInformation;
    private String consumerLink;
    private String fetchKey;
    
    public ProviderCommandAggregate(String providerId, String providerName, String requestId, String requestedDate,
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

    
    @CommandHandler
	public ProviderCommandAggregate(CreateRequestCommand prm) {
    	//RequestAdded ra=new RequestAdded(prm.getRequestId(),prm.getProviderName(),prm.getRequestId(),prm.getRequestedDate(),prm.getRequestedInformation(),prm.getConsumerLink(),prm.getFetchKey());
    	RequestAdded ra=new RequestAdded();
    	BeanUtils.copyProperties(prm, ra);
        AggregateLifecycle.apply(ra);
    }
    
    @EventSourcingHandler
    public void on(RequestAdded ra) {
    	BeanUtils.copyProperties(ra, this);
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
