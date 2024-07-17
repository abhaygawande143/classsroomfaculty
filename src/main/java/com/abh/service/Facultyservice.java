package com.abh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abh.dao.FacultyDao;
import com.abh.entity.Faculties;

@Service
public class Facultyservice {

	@Autowired
	FacultyDao facultyDao;
	public List<Faculties> getallfaculties() {
		return facultyDao.getallfaculties();
		
	}
	public Faculties getfacultiesbyId(long id) {
		
		return facultyDao.getfacultiesbyId(id);
	}
	@Transactional(readOnly = true)
	public String createfaculty(Faculties faculties) {
		
		return facultyDao.createfaculty(faculties);
	}
	public String deletefaculty(long id) {
		
		return facultyDao.deletefaculty(id);
	}
	
	
	

}
