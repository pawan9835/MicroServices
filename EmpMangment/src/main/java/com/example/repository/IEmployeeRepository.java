package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByLastName(String query);



	List<Employee> findByfirstName(String lastName);

	List<Employee> findByemail(String email);

	@Query("select e from Employee e where e.firstName like %?1")
	List<Employee> findByfirstNameEndsWith(String chars);

}
