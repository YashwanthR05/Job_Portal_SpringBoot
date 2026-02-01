package com.jobportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private User jobseeker;
//	Many JobApplications → One User

	
	@ManyToOne
	private Job job;
//	Many JobApplications → One Job
//	A job can receive many application
	
	private String status;// APPLIED, SHORTLISTED, REJECTED
	


}
