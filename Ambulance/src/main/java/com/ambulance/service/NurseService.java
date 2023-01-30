package com.ambulance.service;

import java.util.List;

import com.ambulance.entity.Nurse;

public interface NurseService {

	Nurse getNurseById(Long id);

	Nurse createNurse(Nurse nurse);

	Nurse updateNurse(Long id, Nurse nurse);

	void deleteNurse(Long id);

	
	


}