package com.abh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abh.dao.DepartDao;
import com.abh.entity.Department;

@Service
public class DepartService {
	@Autowired
	DepartDao departDao;

	@Transactional(readOnly = true)
	public String createdep(Department department) {
       
		return departDao.createdep(department);
	}

	public List<Department> getalldepartment() {
		
		return departDao.getalldepartment();
	}

	public Department getdepartmentbyId(long id) {
		
		return departDao.getdepartmentbyId(id);
	}

	@Transactional(readOnly = true)
	public void deletedepartment(long id) {
		departDao.deletedepartment(id);
		
	}

}
