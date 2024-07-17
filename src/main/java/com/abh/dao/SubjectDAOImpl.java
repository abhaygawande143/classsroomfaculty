package com.abh.dao;

import com.abh.entity.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubjectDAOImpl  {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Subject> getAllSubjects() {
		Session session = null;
		List<Subject> subjects;
		try {
			session = sessionFactory.openSession();
			subjects = session.createQuery("FROM Subject", Subject.class).getResultList();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return subjects;
	}

	public Subject getSubjectById(Long id) {
		Session session = null;
		Subject subject = null;
		try {
			session = sessionFactory.openSession();
			subject = session.get(Subject.class, id);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return subject;
	}

	public void saveSubject(Subject subject) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(subject);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteSubject(Long id) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Subject subject = session.get(Subject.class, id);
			session.delete(subject);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
