package com.ProjectCourseEndIV.PetClinicVisit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectCourseEndIV.PetClinicVisit.Service.PetService;
import com.ProjectCourseEndIV.PetClinicVisit.model.Pet;

@RestController
@RequestMapping("/api/pets")
public class PetController {

	@Autowired
	private PetService petService; 

	@GetMapping
	public List<Pet>getAllPets(){
		return petService.getAllPets(); 
		
	}
	
	@PostMapping
	public Pet addPet(@RequestBody Pet pet) {
		return petService.addPet(pet);
	}
	
	@PutMapping("/{id}")
	public Pet updatePet(@PathVariable Long id, @RequestBody Pet pet) {
		pet.setId(id);
		return petService.updatePet(pet); 
		
	}
	
	@DeleteMapping("/{id}")
	public void deletePet(@PathVariable Long id) {
		petService.deletePet(id);
	}
	
	
}
