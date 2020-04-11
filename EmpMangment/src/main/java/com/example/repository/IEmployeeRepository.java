package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByLastName(String query);

	// public List<Employee> findbyFirstname(String first_name);

	List<Employee> findByfirstName(String lastName);

	List<Employee> findByemail(String email);

}
