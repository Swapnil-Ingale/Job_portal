package com.api.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.api.dao.JobDao;
import com.api.api.entities.Job;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private  JobDao jobDao;

	@Override
	public List<Job> getJobs() {
		// TODO Auto-generated method stub
//		return list;
		return jobDao.findAll();
	}

	@Override
	public Job addJob(Job job) {
		jobDao.save(job);
		return job;
	}

	@Override
	public Job updateJob(Job job) {
		jobDao.save(job);
		return job;
	}

	@Override
	public String deleteJob(int jobId) {
		jobDao.deleteById(jobId);
		return null;
	}

	@Override
	public Optional<Job> getJob(int jobId) {
		// TODO Auto-generated method stub
		return jobDao.findById(jobId);
	}

}
