package com.abh.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abh.entity.ClassSchedule;

@Repository
public class ClassscheduleDao {

	@Autowired
	SessionFactory factory;
	Session session = null;

	public List<ClassSchedule> getallclassschedule() {
		try {
			Session session = factory.openSession();
			Criteria criteria = session.createCriteria(ClassSchedule.class);
			List<ClassSchedule> schedules = criteria.list();
			return schedules;

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public ClassSchedule getschedulebyid(long id) {
		ClassSchedule classSchedule = null;
		try {
			Session session = factory.openSession();
			classSchedule = session.get(ClassSchedule.class, id);
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return classSchedule;
	}

	public ClassSchedule createschedule(ClassSchedule classSchedule) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(classSchedule);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return classSchedule;

	}

	public void deletemschedule(long id) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			ClassSchedule schedule = session.get(ClassSchedule.class, id);
			session.delete(schedule);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

}
