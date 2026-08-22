package com.example.resume_application_tracker;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4321")
public class InternshipController {

    AtomicLong counter = new AtomicLong(0);
    InternshipRepository repository;

    public InternshipController(InternshipRepository internshipRepository) {
        this.repository = internshipRepository;

        repository.save(new Internship(1, "Software Engineer", "Cisco", "This is dummy data to show case", "Example notes", "Pending"));
        repository.save(new Internship(2, "Data Engineer", "IBM", "This is dummy data to show case", "Example notes", "Pending"));
        repository.save(new Internship(3, "Software Engineer", "Google", "This is dummy data to show case", "Example notes", "Pending"));
        repository.save(new Internship(4, "Software Engineer", "Apple", "This is dummy data to show case", "Example notes", "Pending"));
    }
    
    @GetMapping("/api/internships")
    public List<Internship> getAllInternships() {
        return repository.findAll();
    }

    @PostMapping("/api/internships")
    public Internship createInternship(
        @RequestBody CreateInternshipRequest request
    ) {
        Internship newInternship = new Internship(
            counter.incrementAndGet(), 
            request.jobtitle(),
            request.company(), 
            request.description(),
            request.notes(),
            request.status()
        );

        return repository.save(newInternship);
    }
}
