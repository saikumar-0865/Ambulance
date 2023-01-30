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

import com.ambulance.entity.Nurse;
import com.ambulance.service.NurseService;

@RestController
@RequestMapping("/nurses")
public class NurseController {

	@Autowired
	private NurseService nurseService;
	
	
	  @GetMapping("/{id}")
	  public ResponseEntity<Nurse> getNurseById(@PathVariable Long id) {
	    Nurse nurse = nurseService.getNurseById(id);
	    if (nurse == null) {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	    return new ResponseEntity<>(nurse, HttpStatus.OK);
	  }

	  @PostMapping
	  public ResponseEntity<Nurse> createNurse(@RequestBody Nurse nurse) {
	    Nurse createdNurse = nurseService.createNurse(nurse);
	    return new ResponseEntity<>(createdNurse, HttpStatus.CREATED);
	  }

	  @PutMapping("/{id}")
	  public ResponseEntity<Nurse> updateNurse(@PathVariable Long id, @RequestBody Nurse nurse) {
	    Nurse updatedNurse = nurseService.updateNurse(id, nurse);
	    if (updatedNurse == null) {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	    return new ResponseEntity<>(updatedNurse, HttpStatus.OK);
	  }

	  @DeleteMapping("/{id}")
	  public ResponseEntity<Void> deleteNurse(@PathVariable Long id) {
	    nurseService.deleteNurse(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	  }
}
