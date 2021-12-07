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

import com.api.api.entities.Employee;
import com.api.api.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return this.employeeService.getEmployees();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable int employeeId)
	{
		return this.employeeService.getEmployee(employeeId);		
	}
	
	@PostMapping("/employees")
	public Employee addEmployees(@RequestBody Employee employee)
	{
		return this.employeeService.addEmployees(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId)
	{
		this.employeeService.deleteEmployee(employeeId);
		return "Record deleted successfully";
	}
}
