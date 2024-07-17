package com.abh.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abh.entity.Faculties;

@Repository
public class FacultyDao {

	@Autowired
	SessionFactory factory;
	Session session=null;
	public List<Faculties> getallfaculties() {
		try {
		Session session=factory.openSession();
		
		Criteria criteria=session.createCriteria(Faculties.class);
		List<Faculties> faculties=criteria.list();
		return faculties;
		
	}
		finally {
			if(session!=null) {
				session.close();
			}
		}

}
	public Faculties getfacultiesbyId(long id) {
		try {
			Session session=factory.openSession();
			Faculties faculties=session.get(Faculties.class, id);
			return faculties;
			
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		
	}
	public String createfaculty(Faculties faculties) {
		Session session=factory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(faculties);
		session.getTransaction().commit();
		
		return "Created or update Succesfully";
	}
	public String deletefaculty(long id) {
		Session session=factory.openSession();
		session.beginTransaction();
		Faculties faculties=session.get(Faculties.class, id);
		session.delete(faculties);
		session.getTransaction().commit();
		
		return "Created or update Succesfully";
		
	}
	
}
