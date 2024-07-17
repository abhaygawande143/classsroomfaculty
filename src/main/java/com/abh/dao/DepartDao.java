package com.abh.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abh.entity.Department;

@Repository
public class DepartDao {
	@Autowired
	SessionFactory factory;

	public String createdep(Department department) {
		Session session = null;
		try {
			session = factory.openSession();
			session.saveOrUpdate(department);

		} finally {
			if (session != null) {
				session.close();
			}

		}

		return "Department inserted succesfully!...";

	}

	public List<Department> getalldepartment() {
		Session session=null;
		try {
			session=factory.openSession();
			Criteria criteria=session.createCriteria(Department.class);
			List<Department> departments=criteria.list();
			return departments;
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		
	}

	public Department getdepartmentbyId(long id) {
		Session session=null;
		Department department=null;
		try {
			session=factory.openSession();
			department=session.get(Department.class, id);
		} finally {
			if (session!=null) {
				session.close();
			}
		}
		return department;
	}

	public void deletedepartment(long id) {
		Session session=null;
		try {
			session=factory.openSession();
			Department department=session.get(Department.class, id);
			session.delete(department);
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		
		
		
		
	}

}
