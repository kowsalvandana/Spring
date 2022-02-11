package com.passanger.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.passanger.model.PasangerModel;
import com.passanger.repo.PassangerRepo;
import com.passanger.service.PassangerService;

@Service
public class PassangerServiceImpl implements PassangerService {
	
	@Autowired
	private PassangerRepo repo;

	@Override
	public Integer savepassanger(PasangerModel passanger) {
		// TODO Auto-generated method stub
		return repo.save(passanger).getId();
	}

	@Override
	public List<PasangerModel> getAllPassangerDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public PasangerModel getOnePassanger(Integer id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	@Override
	public void deletePassanger(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	
}
