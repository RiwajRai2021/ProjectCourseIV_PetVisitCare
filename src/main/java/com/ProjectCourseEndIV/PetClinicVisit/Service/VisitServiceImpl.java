package com.ProjectCourseEndIV.PetClinicVisit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectCourseEndIV.PetClinicVisit.Repository.VisitRepository;
import com.ProjectCourseEndIV.PetClinicVisit.model.Visit;

@Service
public class VisitServiceImpl implements VisitService {
	
	@Autowired
	private VisitRepository visitRepository; 
	

	@Override
	public List<Visit> getAllVisits() {
	
		return visitRepository.findAll() ;
	}

	@Override
	public Visit addVisit(Visit visit) {
	
		return visitRepository.save(visit);
	}

	@Override
	public Visit updateVisit(Visit visit) {
		
		return visitRepository.save(visit);
	}

	@Override
	public void deleteVisit(Long id) {
		visitRepository.deleteById(id);
		
	}

}
