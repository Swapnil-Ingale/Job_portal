package com.api.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.api.dao.EmployeeDao;
import com.api.api.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private  EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee addEmployees(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public String deleteEmployee(int employeeId) {
		employeeDao.deleteById(employeeId);
		return null;
	}

	@Override
	public Optional<Employee> getEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.findById(employeeId);
	}

}
