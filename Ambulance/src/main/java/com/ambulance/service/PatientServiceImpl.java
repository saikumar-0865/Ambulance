package com.ambulance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambulance.entity.Patient;
import com.ambulance.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient createPatient(Patient patient) {
		return patientRepository.save(patient);
	}



	
	
	

	
}
