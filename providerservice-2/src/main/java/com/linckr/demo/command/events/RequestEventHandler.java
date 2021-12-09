package com.linckr.demo.command.events;



import org.axonframework.eventhandling.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.linckr.demo.command.controller.ProviderCommandController;
import com.linckr.demo.entity.ProviderRequestModel;
import com.linckr.demo.repo.RequestsRepo;

@Component
public class RequestEventHandler {
	@Autowired
	private RequestsRepo rs;
	Logger l=LoggerFactory.getLogger(ProviderCommandController.class);
	
	@EventHandler
	public void on(RequestAdded ra) {
		ProviderRequestModel  prm=new ProviderRequestModel();
		BeanUtils.copyProperties(ra, prm);
		rs.save(prm);
		l.info("Request is added");
	}

}
