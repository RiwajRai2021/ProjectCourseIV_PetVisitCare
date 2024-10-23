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

import com.ProjectCourseEndIV.PetClinicVisit.Service.OwnerService;
import com.ProjectCourseEndIV.PetClinicVisit.model.Owner;


@RestController
@RequestMapping("/api/owners")
public class OwnerController {
	
	@Autowired
	private OwnerService ownerService; 
	
	@GetMapping
	public List<Owner>getAllOwners(){
		return ownerService.getAllOwners(); 
	}
	
	@PostMapping
	public Owner addOwner(@RequestBody Owner owner) {
		return ownerService.addOwner(owner);
	}

	@PutMapping("/{id}")
	public Owner updateOwner(@PathVariable Long id, @RequestBody Owner owner) {
		owner.setId(id); 
		return ownerService.updateOwner(owner); 
	}
	
	@DeleteMapping("/{id}")
	public void deleteOwner(@PathVariable Long id) {
		ownerService.deleteOwner(id); 
	}
	
}
