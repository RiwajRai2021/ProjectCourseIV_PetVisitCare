package com.ProjectCourseEndIV.PetClinicVisit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectCourseEndIV.PetClinicVisit.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
