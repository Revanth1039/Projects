package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.ApiModel;
import com.example.demo.repo.ApiRepo;


@Service
public class ApiService {
	@Autowired
	private ApiRepo ar;
	
	public ApiModel getProviderById(String id) throws ResourceNotFoundException{
		//try {
		ApiModel am= ar.findByProviderId(id);
		if(am==null) {
			throw new ResourceNotFoundException("Please enter correct id");
		}
		return am;
		//}
		//catch(Exception e) {
			
		//}
		
	}

	public List<ApiModel> getAll() {
		return (List<ApiModel>) ar.findAll();	
	}

	public void add(ApiModel am) {
		ar.save(am);
	}
	
	

	public ApiModel deleteByProviderId(String id) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		//try {
			ApiModel am= ar.findByProviderId(id);
			if(am==null) {
				throw new ResourceNotFoundException("Please enter correct id");
			}
			//ar.deleteByProviderId(id);
			ar.deleteById(id);
			return am;
		//}
		
		
	}
	

}
