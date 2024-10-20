package com.ProjectCourseEndIV.PetClinicVisit.Service;

import java.util.List;

import com.ProjectCourseEndIV.PetClinicVisit.model.Visit;

public interface VisitService {
	
	List<Visit>getAllVisits(); 
	Visit addVisit(Visit visit); 
	Visit updateVisit(Visit visit); 
	void deleteVisit(Long id); 
	
	

}
