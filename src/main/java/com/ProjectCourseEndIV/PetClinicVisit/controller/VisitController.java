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

import com.ProjectCourseEndIV.PetClinicVisit.Service.VisitService;
import com.ProjectCourseEndIV.PetClinicVisit.model.Visit;

@RestController
@RequestMapping("/api/visits")
public class VisitController {
	
	@Autowired
	private VisitService visitService; 
	
	@GetMapping
	public List<Visit>getAllVisits(){
		return visitService.getAllVisits(); 
		
	}
	@PostMapping
	public Visit addVisit(@RequestBody Visit visit) {
		return visitService.addVisit(visit); 
	}
	
	@PutMapping("/{id}")
	public Visit updateVisit(@PathVariable Long id, @RequestBody Visit visit) {
		visit.setId(id);
		return visitService.updateVisit(visit);
	}
	
	@DeleteMapping("/{id}")
	public void deleteVisit(@PathVariable Long id) {
		visitService.deleteVisit(id);
	}
	

}
