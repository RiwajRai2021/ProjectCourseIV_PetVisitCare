package com.ProjectCourseEndIV.PetClinicVisit.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String name; 
	private String address; 
	private String phone; 
	
	@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	private List<Pet>pets;

	public Owner(Long id, String name, String address, String phone, List<Pet> pets) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pets = pets;
	}

	public Owner() {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", pets=" + pets
				+ "]";
	} 
	
	

}
