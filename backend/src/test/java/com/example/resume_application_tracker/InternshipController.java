package com.example.resume_application_tracker;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternshipController {

    InternshipRepository repository;

    public InternshipController(InternshipRepository internshipRepository) {
        this.repository = internshipRepository;
    }
    
    @GetMapping("/api/internships")
    public List<Internship> getAllInternships() {
        return repository.getAll();
    }

    // @PostMapping("/api/internship")
    // public Internship newInternship() {
        
    // }

}
