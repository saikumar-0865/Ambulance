package com.ambulance.service;

import java.util.List;

import com.ambulance.entity.Ambulance;

public interface AmbulanceService {

	List<Ambulance> getAllAmbulances();

	Ambulance getAmbulanceById(Long id);

	Ambulance addAmbulance(Ambulance ambulance);






	



}