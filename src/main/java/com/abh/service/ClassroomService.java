package com.abh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abh.dao.ClassroomDao;
import com.abh.entity.Classroom;

@Service
public class ClassroomService {
	
	@Autowired
	private ClassroomDao classroomDao;

	public List<Classroom> getallclassroom() {
		
		return classroomDao.getallclassroom();
	}

	public ArrayList<String> getclassroombyId(int id) {
		
		ArrayList<String> nmbyid=new ArrayList<>();
		List<Classroom>classroomsnms =classroomDao.getallclassroom();
		
		for (Classroom nms : classroomsnms) {
			
			if (nms.getId()==id) {
				nmbyid.add(nms.getClassnm());

			}
		}
		
		return nmbyid;
	}

	public void insertdata(Classroom classroom) {
		
		 classroomDao.insertdata(classroom);
	}

	public void updatedata(Classroom classroom) {
		classroomDao.updatedata(classroom);
		
	}

	public void deletedata(Classroom classroom) {
		classroomDao.deletedata(classroom);
		
	}

}
