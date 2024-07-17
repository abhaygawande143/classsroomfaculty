package com.abh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassSchedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	@Column(name = "subject_id", nullable = false)
	private long subjectid;
	

	@Column(name = "classroom_id", nullable = false)
	private long classroomid;
	
	@Column(name = "dayof_week", nullable = false)
	private String dayofweek;
	
	@Column(name = "start_time", nullable = false)
	private String starttime;
	
	@Column(name = "end_time", nullable = false)
	private String endtime;

	public ClassSchedule(long id, long subjectid, long classroomid, String dayofweek, String starttime,
			String endtime) {
		super();
		this.id = id;
		this.subjectid = subjectid;
		this.classroomid = classroomid;
		this.dayofweek = dayofweek;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public ClassSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassSchedule(long subjectid, long classroomid, String dayofweek, String starttime, String endtime) {
		super();
		this.subjectid = subjectid;
		this.classroomid = classroomid;
		this.dayofweek = dayofweek;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(long subjectid) {
		this.subjectid = subjectid;
	}

	public long getClassroomid() {
		return classroomid;
	}

	public void setClassroomid(long classroomid) {
		this.classroomid = classroomid;
	}

	public String getDayofweek() {
		return dayofweek;
	}

	public void setDayofweek(String dayofweek) {
		this.dayofweek = dayofweek;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	@Override
	public String toString() {
		return "ClassSchedule [id=" + id + ", subjectid=" + subjectid + ", classroomid=" + classroomid + ", dayofweek="
				+ dayofweek + ", starttime=" + starttime + ", endtime=" + endtime + "]";
	}
	

}
