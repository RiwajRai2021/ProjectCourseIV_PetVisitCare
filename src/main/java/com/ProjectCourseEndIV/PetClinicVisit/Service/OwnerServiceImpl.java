package com.ProjectCourseEndIV.PetClinicVisit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectCourseEndIV.PetClinicVisit.Repository.OwnerRepository;
import com.ProjectCourseEndIV.PetClinicVisit.model.Owner;

@Service
public class OwnerServiceImpl implements OwnerService {
	
	@Autowired
	private OwnerRepository ownerRepository; 

	@Override
	public List<Owner> getAllOwners() {
	
		return ownerRepository.findAll();
	}

	@Override
	public Owner addOwner(Owner owner) {
	
		return ownerRepository.save(owner);
	}

	@Override
	public Owner updateOwner(Owner owner) {
		
		return ownerRepository.save(owner);
	}

	@Override
	public void deleteOwner(Long id) {
		ownerRepository.deleteById(id);
		
	}

}
