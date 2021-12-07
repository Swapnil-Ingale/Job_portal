package com.api.api.services;

import java.util.List;
import java.util.Optional;

import com.api.api.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public Optional<Employee> getEmployee(int employeeId);
	
	public Employee addEmployees(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public String deleteEmployee(int employeeId);
}
