package com.example.demo.providerrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Provider;


@Repository
public interface ProviderRepo extends JpaRepository<Provider, String> {

	Provider findByProviderId(String id);
	
	
	

}
