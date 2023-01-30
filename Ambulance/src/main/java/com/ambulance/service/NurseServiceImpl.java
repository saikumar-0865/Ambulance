package com.ambulance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambulance.entity.Nurse;
import com.ambulance.repository.NurseRepository;

@Service
public class NurseServiceImpl implements NurseService {
	
	@Autowired
	private NurseRepository nurseRepository;

	@Override
	public Nurse getNurseById(Long id) {
		return nurseRepository.findById(id).orElse(null);
	}

	@Override
	public Nurse createNurse(Nurse nurse) {
	    return nurseRepository.save(nurse);

	}

	@Override
	public Nurse updateNurse(Long id, Nurse nurse) {
		 Nurse existingNurse = nurseRepository.findById(id).orElse(null);
		    if (existingNurse == null) {
		      return null;
		    }
		    existingNurse.setName(nurse.getName());
		    existingNurse.setContact(nurse.getContact());
		    existingNurse.setAmbulance(nurse.getAmbulance());
		    return nurseRepository.save(existingNurse);
		
	}

	@Override
	public void deleteNurse(Long id) {
		 nurseRepository.deleteById(id);
		
	}
	
	

	

}
