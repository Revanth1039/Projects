package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ApiModel;


@Repository
public interface ApiRepo extends JpaRepository<ApiModel, String> {

    ApiModel findByProviderId(String id);

	//void deleteByProviderId(String id);
	boolean existsByProviderId(String id);

}
