package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IEmployeeDAO;
import com.example.entity.Employee;
import com.example.service.IEmployeeService;

@Service
public class IEmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO IEmpDao;

	@Override
	public void addEmployee(Employee emp) {

		IEmpDao.addEmployee(emp);

	}

	@Override
	public Employee getEmployee(int empId) {

		Employee e = IEmpDao.getEmployee(empId);
		return e;
	}

	@Override
	public Iterable<Employee> getAllEmployee() {
		return IEmpDao.getAllEmployee();
	}

	@Override
	public void removeEmployeeByID(int empID) {

		IEmpDao.removeEmployeeByID(empID);
	}

	@Override
	public void updateEmployee(Employee emp) {

		IEmpDao.updateEmployee(emp);

	}

	@Override
	public List<Employee> findbyLastname(String last_name) {
		// TODO Auto-generated method stub
		return IEmpDao.findbyLastname(last_name);
	}

	@Override
	public List<Employee> findbyFirstName(String first_name) {

		return IEmpDao.findbyFirstName(first_name);
	}

	@Override
	public List<Employee> findByemail(String email) {
		// TODO Auto-generated method stub
		return IEmpDao.findByemail(email);
	}

	
}
