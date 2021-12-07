package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Consumer;


@Repository
public interface ConsumerRepo extends JpaRepository<Consumer, String> {

	Consumer findByConsumerId(String id);

}
