package com.abh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String classnm;

	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classroom(int id, String classnm) {
		super();
		this.id = id;
		this.classnm = classnm;
	}

	public Classroom(String classnm) {
		super();
		this.classnm = classnm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassnm() {
		return classnm;
	}

	public void setClassnm(String classnm) {
		this.classnm = classnm;
	}

	@Override
	public String toString() {
		return "Classroom [id=" + id + ", classnm=" + classnm + "]";
	}
	
	
	

}
