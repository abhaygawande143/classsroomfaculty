package com.abh.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abh.entity.Classroom;

@Repository
public class ClassroomDao {

	@Autowired
	SessionFactory factory;

	public List<Classroom> getallclassroom() {
        
//		Classroom classroom1=new Classroom("class no.14");
//		Classroom classroom2=new Classroom("class no.15");
//		Classroom classroom3=new Classroom("class no.16");
//		List<Classroom> classnames= new ArrayList<>();
//		classnames.add(classroom1);
//		classnames.add(classroom2);
//		classnames.add(classroom3);
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Classroom.class);
		List<Classroom> classrooms = criteria.list();

		return classrooms;
	}

	public void insertdata(Classroom classroom) {
		Session session = factory.openSession();
	     org.hibernate.Transaction transaction=session.beginTransaction();
	     session.save(classroom);
	     transaction.commit();
		
	}

	public void updatedata(Classroom classroom) {
		Session session = factory.openSession();
	     org.hibernate.Transaction transaction=session.beginTransaction();
	     session.update(classroom);
	     transaction.commit();
		
		
	}

	public void deletedata(Classroom classroom) {
		Session session = factory.openSession();
	     org.hibernate.Transaction transaction=session.beginTransaction();
	     session.delete(classroom);
	     transaction.commit();
	     
		
	}

}
