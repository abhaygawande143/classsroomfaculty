package com.abh.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abh.entity.Courses;

@Repository
public class CoursesDao {

	@Autowired
	SessionFactory factory;

	//Read
	public List<Courses> getallCoursesnames() {

		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Courses.class);
		List courses = criteria.list();

		return courses;
	}
	
	
    public Courses getCourseById(int id) {
        Session session = null;
        Courses course = null;
        try {
            session = factory.openSession();
            course = session.get(Courses.class, id);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return course;
    }

    //update/insert
	public void updatecoursedata(Courses courses) {
		Session session = null;
        try {
            session = factory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(courses);
            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }


	//delete
	public void deleteCourse(int id) {
        Session session = null;
        try {
            session = factory.openSession();
            session.beginTransaction();
            Courses course = session.get(Courses.class, id);
            session.delete(course);
            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

	

}
