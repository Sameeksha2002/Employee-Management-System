package com.projects.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.projects.ems.model.Employee;
import com.projects.ems.model.Employee1;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee1, Long> {

}
