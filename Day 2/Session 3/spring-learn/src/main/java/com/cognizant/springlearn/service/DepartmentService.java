package com.cognizant.springlearn.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.dao.DepartmentDao;

@Service
public class DepartmentService {
	
	DepartmentDao departmentDao=new DepartmentDao();
	
	@Transactional
	public ArrayList<Department> getAllDepartments(){
		ArrayList<Department> deptList=departmentDao.getAllDepartments();
		return deptList;
	}

}
