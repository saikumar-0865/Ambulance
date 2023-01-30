package com.ambulance.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Patient {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
    private String contact;
    private String illness;
    @ManyToOne
    private Ambulance ambulance;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getIllness() {
		return illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}
	public Ambulance getAmbulance() {
		return ambulance;
	}
	public void setAmbulance(Ambulance ambulance) {
		this.ambulance = ambulance;
	}
	public Patient(Long id, String name, String contact, String illness, Ambulance ambulance) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.illness = illness;
		this.ambulance = ambulance;
	}
	public Patient() {
		super();
	}
    
    
    

}
