package com.abh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String depnm;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(long id, String depnm) {
		super();
		this.id = id;
		this.depnm = depnm;
	}

	public Department(String depnm) {
		super();
		this.depnm = depnm;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepnm() {
		return depnm;
	}

	public void setDepnm(String depnm) {
		this.depnm = depnm;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", depnm=" + depnm + "]";
	}

}
