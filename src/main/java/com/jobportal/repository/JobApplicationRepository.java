package com.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.model.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long>{

}
//Why Do We Use a Repository?
//To separate database logic from business logic and make data access clean, reusable, and maintainable.
//What a Repository Actually Is
//A Repository is a layer that:
//Talks directly to the database
//Handles CRUD operations
//Hides SQL / JPA logic from the rest of the application