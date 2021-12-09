package com.linckr.demo.query.projection;

import java.util.List;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.linckr.demo.entity.ProviderRequestModel;
import com.linckr.demo.query.GetRequestsQuery;
import com.linckr.demo.repo.RequestsRepo;



@Component
public class QueryProjection {
	
	@Autowired
	private RequestsRepo rp;
	
	
	@QueryHandler
	public List<ProviderRequestModel> handle1(GetRequestsQuery grq){
		return rp.findAll();
	}

}
