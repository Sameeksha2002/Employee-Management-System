package com.projects.ems.model;

import org.hibernate.validator.constraints.NotEmpty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

//@Entity
//@Table(name= "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	

	@jakarta.validation.constraints.NotEmpty(message= "This field is required")
	@Size(min = 3, message = "Please enter valid name" )
	@Column(name= "first_name")
	private String firstName;
	

	@jakarta.validation.constraints.NotEmpty(message= "This field is required")
	@Size(min = 3, message="Please enter valid name")
	@Column(name= "last_name")
	private String lastName;
	

	@jakarta.validation.constraints.NotEmpty(message= "This field is required")
    @Email(message = "Please enter a valid e-mail address")
	@Column(name= "email")
	private String email;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
}
