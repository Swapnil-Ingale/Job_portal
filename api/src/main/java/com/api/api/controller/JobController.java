package com.api.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.api.entities.Job;
import com.api.api.services.JobService;

@RestController
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@GetMapping("/jobs")
	public List<Job> getJobs()
	{
		return this.jobService.getJobs();
	}
	
	@GetMapping("/jobs/{jobId}")
	public Optional<Job> getJob(@PathVariable int jobId)
	{
		return this.jobService.getJob(jobId);		
	}
	
	@PostMapping("/jobs")
	public Job addJob(@RequestBody Job job)
	{
		return this.jobService.addJob(job);
	}
	
	@PutMapping("/jobs")
	public Job updateJob(@RequestBody Job job)
	{
		return this.jobService.updateJob(job);
	}
	
	@DeleteMapping("/jobs/{jobId}")
	public String deleteJob(@PathVariable int jobId)
	{
		this.jobService.deleteJob(jobId);
		return "Record deleted successfully";
	}
}
