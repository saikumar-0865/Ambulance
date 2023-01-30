package com.ambulance.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ambulance.entity.Ambulance;
import com.ambulance.service.AmbulanceService;
import com.ambulance.service.NurseService;


@RestController
@RequestMapping("/api/ambulances")
public class Controller {
	
	
	@Autowired
	private AmbulanceService ambulanceService;
	
	private NurseService nurseService;
	
	
	@GetMapping
	public List<Ambulance> getAllAmbulances() {
		return ambulanceService.getAllAmbulances();
	}
	
	@GetMapping("/{id}")
	public Ambulance getAmbulanceById(@PathVariable Long id) {
		return ambulanceService.getAmbulanceById(id);
	}
	
	@PostMapping
	public Ambulance addAmbulance(@RequestBody Ambulance ambulance) {
		return ambulanceService.addAmbulance(ambulance);
	}
	
	
	

	
	

   



}
