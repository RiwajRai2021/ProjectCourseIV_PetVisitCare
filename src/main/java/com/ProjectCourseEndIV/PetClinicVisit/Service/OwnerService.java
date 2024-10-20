package com.ProjectCourseEndIV.PetClinicVisit.Service;

import java.util.List;

import com.ProjectCourseEndIV.PetClinicVisit.model.Owner;

public interface OwnerService {

	List<Owner>getAllOwners(); 
	Owner addOwner(Owner owner); 
	Owner updateOwner(Owner owner); 
	void deleteOwner(Long id); 
	
}
