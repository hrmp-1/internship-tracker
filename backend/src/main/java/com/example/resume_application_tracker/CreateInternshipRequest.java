package com.example.resume_application_tracker;

public record CreateInternshipRequest (
    String jobtitle,
    String company,
    String description,
    String notes,
    String status
) {}
