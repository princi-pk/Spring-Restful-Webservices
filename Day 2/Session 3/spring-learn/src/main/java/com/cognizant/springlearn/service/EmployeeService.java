package com.cognizant.springlearn.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.dao.EmployeeDao;



@Service
public class EmployeeService {
	
	EmployeeDao employeeDao=new EmployeeDao();
	
	@Transactional
	public ArrayList<Employee> getAllEmployees(){
		ArrayList<Employee> empList=employeeDao.getAllEmployees();
		return empList;
	}

}
