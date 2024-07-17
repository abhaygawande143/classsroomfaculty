package com.abh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abh.dao.ClassscheduleDao;
import com.abh.entity.ClassSchedule;

@Service
public class ClassScheduleService {

	@Autowired
	private ClassscheduleDao classscheduleDao;
	
	public List<ClassSchedule> getallclassschedule() {
		return classscheduleDao.getallclassschedule();
		
		
	}
	public ClassSchedule getschedulebyid(long id) {
		
		return classscheduleDao.getschedulebyid(id);
	}
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public ClassSchedule createschedule(ClassSchedule classSchedule) {
		
		return classscheduleDao.createschedule(classSchedule);
	}
	
	@Transactional(readOnly = true)
	public void deletemschedule(long id) {
		classscheduleDao.deletemschedule(id);
		
	}
	
	
	

}
