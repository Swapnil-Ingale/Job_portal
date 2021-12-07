package com.api.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.api.entities.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}
