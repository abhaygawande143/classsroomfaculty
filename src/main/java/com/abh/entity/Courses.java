package com.abh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	
	@Column(nullable = false)
	private String coursenm;

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Courses(int id, String coursenm) {
		super();
		this.id = id;
		this.coursenm = coursenm;
	}

	public Courses(String coursenm) {
		super();
		this.coursenm = coursenm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoursenm() {
		return coursenm;
	}

	public void setCoursenm(String coursenm) {
		this.coursenm = coursenm;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", coursenm=" + coursenm + "]";
	}
	
	

}
