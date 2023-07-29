package com.projects.ems.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "employees")
public class Employee1 {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@jakarta.validation.constraints.NotEmpty(message= "This field is required")
	@Size(min = 3, message = "Please enter valid name" )
	@Column(name= "name")
	private String name;
	
	@jakarta.validation.constraints.NotEmpty(message= "This field is required")
	@Size(min = 3, message = "Please enter valid city" )
	@Column(name= "city")
	private String city;
	
	@jakarta.validation.constraints.NotEmpty(message= "This field is required")
    @Email(message = "Please enter a valid e-mail address")
	@Column(name= "email", unique= true)
	private String email;
	
	@jakarta.validation.constraints.NotEmpty(message= "This field is required")
	@Column(name="password", length=60)
	private String password;
	
	@jakarta.validation.constraints.NotEmpty(message= "This field is required")
	@Column(name="designation", length=60)
	private String designation;
	
	@jakarta.validation.constraints.NotEmpty(message= "This field is required")
	@Column(name="salary", length=60)
	private String salary;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", password="
				+ password + ", Designation=" + designation + ", salary=" + salary + "]";
	}
	
	
}
