package com.ambulance.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ambulance {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String registrationNumber;
	  
	@OneToMany(mappedBy = "ambulance", fetch = FetchType.EAGER)
	private List<Nurse> nurses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public List<Nurse> getNurses() {
		return nurses;
	}

	public void setNurses(List<Nurse> nurses) {
		this.nurses = nurses;
	}

	public Ambulance(Long id, String registrationNumber, List<Nurse> nurses) {
		super();
		this.id = id;
		this.registrationNumber = registrationNumber;
		this.nurses = nurses;
	}

	public Ambulance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
