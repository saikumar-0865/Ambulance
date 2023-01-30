package com.ambulance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ambulance.entity.Ambulance;

@Repository
public interface AmbulanceRepository extends JpaRepository<Ambulance, Long> {

	Ambulance getAmbulanceById(Long id);
	
	

	
	 
}
