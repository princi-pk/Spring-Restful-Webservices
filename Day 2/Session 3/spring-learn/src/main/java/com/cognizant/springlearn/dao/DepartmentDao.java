package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.Department;

public class DepartmentDao {
	public static ArrayList<Department> DEPARTMENT_LIST;
	
	public DepartmentDao() {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMENT_LIST = (ArrayList) context.getBean("departmentList");
	}
	
	public ArrayList<Department> getAllDepartments(){
		return DEPARTMENT_LIST;
	}
}
