package com.ProjectCourseEndIV.PetClinicVisit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectCourseEndIV.PetClinicVisit.Repository.PetRepository;
import com.ProjectCourseEndIV.PetClinicVisit.model.Pet;

@Service
public class PetServiceImpl implements PetService {
	
	@Autowired
	private PetRepository petRepository; 
	

	@Override
	public List<Pet> getAllPets() {
		
		return petRepository.findAll();
	}

	@Override
	public Pet addPet(Pet pet) {
		
		return petRepository.save(pet);
	}

	@Override
	public Pet updatePet(Pet pet) {
		
		return petRepository.save(pet);
	}

	@Override
	public void deletePet(Long id) {
	petRepository.deleteById(id);
		
	}
	
	
	

}
