package com.projects.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.ems.model.Employee;
import com.projects.ems.model.Employee1;
import com.projects.ems.repository.EmployeeRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public List<Employee1> getAllEmployees() {
		
		return employeeRepo.findAll();
	}

	@Override
	public void addEmployee(Employee1 employee) {
		this.employeeRepo.save(employee);
		
	}

	@Override
	public void deletemployee(long id) {
		employeeRepo.deleteById(id);
		
	}

	@Override
	public Employee1 getEmployee(long id) {
		Optional<Employee1> optional = employeeRepo.findById(id);
		Employee1 employee = null;
		if(optional.isPresent()){
			employee = optional.get();		
			}
		else {
			throw new RuntimeException("Employee not found with id : " + id);
		}
//		System.out.println(employee);
		return employee;
	}

	
	
	

	

}
