package com.projects.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projects.ems.model.Employee;
import com.projects.ems.model.Employee1;
import com.projects.ems.service.EmployeeServices;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServices empServices;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("listOfEmployees", empServices.getAllEmployees());
		//spring boot auto configure view resolver for Thymeleaf
		return "index";
	}
	
	@GetMapping("/showNewEmployeeForm")
	public String addEmployee(Model model) {
				
		Employee1 employee = new Employee1();
		model.addAttribute("employee", employee);
		return "addEmployeeForm";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee1 empl, BindingResult results) {
		
		if (results.hasErrors()) {  
//			 System.out.println(results);
			 return "addEmployeeForm";
		 }
		 else {
		   empServices.addEmployee(empl);
		   return "redirect:/";
		 }
	}
	
	@PostMapping("/updateEmployee")
	public String updateEmployee(@Valid @ModelAttribute("employee") Employee1 empl, BindingResult results) {
		
		if (results.hasErrors()) {  
//			 System.out.println(results);
			 return "updateEmployee";
		 }
		 else {
		   empServices.addEmployee(empl);
		   return "redirect:/";
		 }
	}
	
	@GetMapping("/updateEmployeeForm/{id}")
	public String updateEmployeeForm(@PathVariable(value = "id") long id, Model model) {	
		
		Employee1 employee = empServices.getEmployee(id);
		model.addAttribute("employee", employee);
		return "updateEmployee";
		
	}
//	@PutMapping("/updateEmployee")
//	public String updateEmployee(@PathVariable(value = "id") long id, Model model) {	
//		Employee employee = empServices.getEmployee(id);
//		model.addAttribute("employee", employee);
//		return "updateEmployee";
//	}

	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") long id) {	
		empServices.deletemployee(id);
		return "redirect:/";
	}
}
