package com.ProjectCourseEndIV.PetClinicVisit.model;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Visit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	private LocalDate visitDate; 
	private String description; 
	
	@ManyToOne
	@JoinColumn(name="pet_id")
	private Pet pet;

	public Visit(Long id, LocalDate visitDate, String description, Pet pet) {
		super();
		this.id = id;
		this.visitDate = visitDate;
		this.description = description;
		this.pet = pet;
	}

	public Visit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	} 
	
	

}
