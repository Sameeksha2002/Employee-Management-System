package com.projects.ems.service;

import java.util.List;

import com.projects.ems.model.Employee;
import com.projects.ems.model.Employee1;


public interface EmployeeServices {

	List<Employee1> getAllEmployees();
	void addEmployee(Employee1 employee);
	void deletemployee(long id);
	Employee1 getEmployee(long id);
}

