package com.abh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculties {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long depid;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="factname",nullable = false)
	private String factname;
	
	@Column(name="departId",nullable = false)
	private long departId;

	public Faculties(long depid, String email, String factname, long departId) {
		super();
		this.depid = depid;
		this.email = email;
		this.factname = factname;
		this.departId = departId;
	}

	public Faculties(String email, String factname, long departId) {
		super();
		this.email = email;
		this.factname = factname;
		this.departId = departId;
	}

	public Faculties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getDepid() {
		return depid;
	}

	public void setDepid(long depid) {
		this.depid = depid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFactname() {
		return factname;
	}

	public void setFactname(String factname) {
		this.factname = factname;
	}

	public long getDepartId() {
		return departId;
	}

	public void setDepartId(long departId) {
		this.departId = departId;
	}

	@Override
	public String toString() {
		return "Faculties [depid=" + depid + ", email=" + email + ", factname=" + factname + ", departId=" + departId
				+ "]";
	}
	
	
}

	