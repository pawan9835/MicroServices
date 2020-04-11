package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.IEmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private IEmployeeService IEmpService;

	@RequestMapping(value = "/employee/hello")
	public String sayHello() {

		return "Hello There !";
	}

	@PostMapping(value = "/employee/add")
	public String addEmployee(@RequestBody Employee emp) {

		IEmpService.addEmployee(emp);

		return "one Record inserted Successfully ";
	}

	@GetMapping(value = "/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		Employee emp = IEmpService.getEmployee(id);
		return emp;
	}

	@RequestMapping(value = "employee/getAll")
	public Iterable<Employee> getAllEmployee() {

		return IEmpService.getAllEmployee();

	}

	@PutMapping(value = "employee/update")
	public String updateEmployee(@RequestBody Employee emp) {

		IEmpService.updateEmployee(emp);
		return "Updated Successfully ";

	}

	@DeleteMapping(value = "employee/{id}")
	public String deleteEmployee(@PathVariable int id) {

		IEmpService.removeEmployeeByID(id);
		return "One Record Has been Removed";
	}

	@GetMapping(value = "last/{bylastname}")
	public List<Employee> findbyLastname(@PathVariable String bylastname) {

		System.out.println("Nameeee " + bylastname);
		return IEmpService.findbyLastname(bylastname);
	}

	@GetMapping(value = "first/{first_name}")
	public List<Employee> getbyFirstName(@PathVariable String first_name) {

		return IEmpService.findbyFirstName(first_name);

	}

	@GetMapping(value = "/email/{email}")
	public List<Employee> getByemail(@PathVariable String email) {

		return IEmpService.findByemail(email);
	}
	
	//adding new Method

}
