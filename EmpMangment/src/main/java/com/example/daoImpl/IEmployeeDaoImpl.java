package com.example.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.IEmployeeDAO;
import com.example.entity.Employee;
import com.example.repository.IEmployeeRepository;

@Repository
public class IEmployeeDaoImpl implements IEmployeeDAO {
	@Autowired
	private IEmployeeRepository IEmpRepo;

	@Override
	public void addEmployee(Employee emp) {

		IEmpRepo.save(emp);
		System.out.println("Saved successfully : " + emp);
	}

	@Override
	public Employee getEmployee(int empId) {
		Optional<Employee> empRs = IEmpRepo.findById(empId);

		Employee emp = empRs.get();
		System.out.println("inside dao emp " + emp);
		return emp;
	}

	@Override
	public Iterable<Employee> getAllEmployee() {
		return IEmpRepo.findAll();
	}

	@Override
	public void removeEmployeeByID(int empID) {

		IEmpRepo.deleteById(empID);
	}

	@Override
	public void updateEmployee(Employee emp) {

		IEmpRepo.save(emp);

	}

	@Override
	public List<Employee> findbyLastname(String last_name) {
		// TODO Auto-generated method stub
		return IEmpRepo.findByLastName(last_name);
	}

	@Override
	public List<Employee> findbyFirstName(String first_name) {

		return (List<Employee>) IEmpRepo.findByfirstName(first_name);
	}

	@Override
	public List<Employee> findByemail(String email) {
		// TODO Auto-generated method stub
		return IEmpRepo.findByemail(email);
	}

	
}
