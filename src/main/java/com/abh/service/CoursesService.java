package com.abh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abh.dao.CoursesDao;
import com.abh.entity.Courses;

@Service
public class CoursesService {

	@Autowired
	CoursesDao coursesDao;

	@Transactional(readOnly = true)
	public List<Courses> getallCoursesnames() {

		return coursesDao.getallCoursesnames();
	}

	
	
	@Transactional(readOnly = true)
	public void updatecoursedata(Courses courses) {
		coursesDao.updatecoursedata(courses);

	}

	@Transactional
	public Courses getCoursebyId(int id) {
		
		return coursesDao.getCourseById(id);
	}

	@Transactional(readOnly = true)
	public void deleteCourse(int id) {
		coursesDao.deleteCourse(id);

	}

}
