package com.api.api.services;

import java.util.List;
import java.util.Optional;

import com.api.api.entities.Job;

public interface JobService {

	public List<Job> getJobs();
	
	public Optional<Job> getJob(int jobId);
	
	public Job addJob(Job job);
	
	public Job updateJob(Job job);
	
	public String deleteJob(int jobId);
}
