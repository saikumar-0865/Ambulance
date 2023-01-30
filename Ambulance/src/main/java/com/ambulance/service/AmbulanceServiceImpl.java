package com.ambulance.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambulance.entity.Ambulance;
import com.ambulance.repository.AmbulanceRepository;

@Service
public class AmbulanceServiceImpl implements AmbulanceService {
	
	@Autowired
	private AmbulanceRepository ambulanceRepository;

	@Override
	public List<Ambulance> getAllAmbulances() {
		return ambulanceRepository.findAll();
	}

	@Override
	public Ambulance getAmbulanceById(Long id) {
		return ambulanceRepository.findById(id).orElse(null);
	}

	@Override
	public Ambulance addAmbulance(Ambulance ambulance) {
		return ambulanceRepository.save(ambulance);
	}

	
	
	
	
	

}
