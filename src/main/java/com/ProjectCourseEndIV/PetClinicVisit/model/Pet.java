package com.ProjectCourseEndIV.PetClinicVisit.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Pet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name; 
	private String type; 
	
	@ManyToOne
	@JoinColumn(name="owner_id")
	private Owner owner; 
	
	@OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
	private List<Visit>visits;
	

	public Pet(Long id, String name, String type, Owner owner, List<Visit> visits) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.owner = owner;
		this.visits = visits;
	}


	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}


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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Owner getOwner() {
		return owner;
	}


	public void setOwner(Owner owner) {
		this.owner = owner;
	}


	public List<Visit> getVisits() {
		return visits;
	}


	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}


	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", type=" + type + "]";
	} 

	
	
}
