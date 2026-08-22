package com.example.resume_application_tracker;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Internship {
    
    @Id
    long id;

    String jobtitle;
    String company;
    String description;
    String notes;
    String status;

    protected Internship() {}

    public Internship(
        long id, 
        String jobtitle, 
        String company,
        String description,
        String notes,
        String status
    ) {
        this.id = id;
        this.jobtitle = jobtitle;
        this.company = company;
        this.description = description;
        this.notes = notes;
        this.status = status;
    }

    public long getId() {
        return this.id;
    }

    public String getJobTitle() {
        return this.jobtitle;
    }

    public String getCompany() {
        return this.company;
    }

    public String getDescription() {
        return this.description;
    }

    public String getNotes() {
        return this.notes;
    }

    public String getStatus() {
        return this.status;
    }

    public void setJobTitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
