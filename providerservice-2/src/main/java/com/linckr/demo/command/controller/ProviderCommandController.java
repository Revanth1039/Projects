package com.linckr.demo.command.controller;

import java.util.UUID;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.linckr.demo.command.CreateRequestCommand;
import com.linckr.demo.entity.ProviderRequestModel;

@RestController
@RequestMapping("/linckr")
public class ProviderCommandController {
	
	@Autowired
	private CommandGateway commandGateway;
	
	public ProviderCommandController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProviderCommandController(CommandGateway commandGateway) {
		super();
		this.commandGateway = commandGateway;
	}
	@PostMapping("/add")
	public ResponseEntity<?> addRequest(@RequestBody ProviderRequestModel prm) {
		prm.setProviderId(UUID.randomUUID().toString());
		//CreateRequestCommand crc=new CreateRequestCommand(UUID.randomUUID().toString(),prm.getProviderName(),prm.getRequestId(),prm.getRequestedDate(),prm.getRequestedInformation(),prm.getConsumerLink(),prm.getFetchKey());
		CreateRequestCommand crc=new CreateRequestCommand();
		BeanUtils.copyProperties(prm, crc);
		String result=commandGateway.sendAndWait(crc);
		return ResponseEntity.ok("Request added with id "+ result);
	}

}
