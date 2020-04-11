package com.example.dao;

import java.util.List;

import com.example.entity.Employee;

public interface IEmployeeDAO {

	public void addEmployee(Employee emp);

	public Employee getEmployee(int empId);

	public Iterable<Employee> getAllEmployee();

	public void removeEmployeeByID(int empID);

	public void updateEmployee(Employee emp);

	public List<Employee> findbyLastname(String last_name);

	public List<Employee> findbyFirstName(String first_name);

	List<Employee> findByemail(String email);

}
