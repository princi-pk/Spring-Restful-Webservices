package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.Employee;

public class EmployeeDao {
	public static ArrayList<Employee> EMPLOYEE_LIST;
	
	public EmployeeDao() {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = (ArrayList) context.getBean("employeeList");
	}
	
	public ArrayList<Employee> getAllEmployees(){
		return EMPLOYEE_LIST;
	}
}
