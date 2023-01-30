package com.ambulance.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Nurse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
    private String contact;
    @ManyToOne(fetch = FetchType.EAGER)
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
	public Ambulance getAmbulance() {
		return ambulance;
	}
	public void setAmbulance(Ambulance ambulance) {
		this.ambulance = ambulance;
	}
	public Nurse(Long id, String name, String contact, Ambulance ambulance) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.ambulance = ambulance;
	}
	public Nurse() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    

}
