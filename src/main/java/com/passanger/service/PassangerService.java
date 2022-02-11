package com.passanger.service;

import java.util.List;

import com.passanger.model.PasangerModel;

public interface PassangerService {

	public Integer savepassanger(PasangerModel passanger);
	public List<PasangerModel> getAllPassangerDetails();
	public PasangerModel getOnePassanger(Integer id);
	public void deletePassanger(Integer id);
	
	
}
