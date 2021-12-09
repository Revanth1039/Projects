package com.linckr.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.linckr.demo.entity.ProviderRequestModel;


@Repository
public interface RequestsRepo extends JpaRepository<ProviderRequestModel, String> {



}
