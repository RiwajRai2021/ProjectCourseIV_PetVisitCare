package com.ProjectCourseEndIV.PetClinicVisit.Service;

import java.util.List;

import com.ProjectCourseEndIV.PetClinicVisit.model.Pet;

public interface PetService {
	
	List<Pet>getAllPets(); 
	Pet addPet(Pet pet); 
	Pet updatePet(Pet pet); 
	void deletePet(Long id); 
}
