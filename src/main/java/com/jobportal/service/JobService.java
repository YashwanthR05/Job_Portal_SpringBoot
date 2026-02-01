package com.jobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobportal.model.Job;
import com.jobportal.repository.JobRepository;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // CREATE
    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    // READ ALL
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    // READ BY ID
    public Job getJobById(Long id) {
        return jobRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found with id: " + id));
    }

    // UPDATE
    public Job updateJob(Long id, Job job) {
        Job existing = getJobById(id);

        existing.setTitle(job.getTitle());
        existing.setCompany(job.getCompany());
        existing.setLocation(job.getLocation());
        existing.setJobType(job.getJobType());
        existing.setSalary(job.getSalary());
        existing.setDescription(job.getDescription());

        return jobRepository.save(existing);
    }

    // DELETE
    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
}
