package com.passanger.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passanger.model.PasangerModel;

public interface PassangerRepo extends JpaRepository<PasangerModel, Integer> {

	

}
