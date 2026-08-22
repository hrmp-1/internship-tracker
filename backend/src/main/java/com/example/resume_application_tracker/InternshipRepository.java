package com.example.resume_application_tracker;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface InternshipRepository extends 
CrudRepository<Internship, Long> {
    
    List<Internship> findAll();

}
