package com.api.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>
 {

}
