package com.ambulance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ambulance.entity.Patient;
import com.ambulance.service.PatientService;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
	
	 @Autowired
	 private PatientService patientService;
	 
	 
	  @PostMapping("/")
	    public Patient createPatient(@RequestBody Patient patient) {
	        return patientService.createPatient(patient);
	    }
	
	


}