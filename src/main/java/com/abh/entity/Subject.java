package com.abh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	
	@Column(name="subnm",nullable = false)
	private String subnm;
	
	@Column(name="course_id",nullable = false)
	private long course_id;

	public Subject(long id, String subnm, long course_id) {
		super();
		this.id = id;
		this.subnm = subnm;
		this.course_id = course_id;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String subnm, long course_id) {
		super();
		this.subnm = subnm;
		this.course_id = course_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubnm() {
		return subnm;
	}

	public void setSubnm(String subnm) {
		this.subnm = subnm;
	}

	public long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", subnm=" + subnm + ", course_id=" + course_id + "]";
	}

	
}
