package com.linckr.demo.query.controller;

import java.util.List;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linckr.demo.entity.ProviderRequestModel;
import com.linckr.demo.query.GetRequestsQuery;

@RestController
@RequestMapping("/linckr")
public class QueryController {
	@Autowired
	private QueryGateway qg;
	@GetMapping("/getAll")
	public List<ProviderRequestModel> getAll(){
		GetRequestsQuery grq=new GetRequestsQuery();
		List<ProviderRequestModel> ls=qg.query(grq, ResponseTypes.multipleInstancesOf(ProviderRequestModel.class)).join();
		return ls;
	}

}
