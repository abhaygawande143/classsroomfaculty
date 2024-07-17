package com.abh.entity;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class FacultyAttendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "faculty_id", nullable = false)
	private Faculties faculties;

	@ManyToOne
	@JoinColumn(name = "class_schedule_id", nullable = false)
	private ClassSchedule class_schedule;

	private LocalDateTime date;
	

	private String status;

	public FacultyAttendance(Long id, Faculties faculty, ClassSchedule classSchedule, LocalDateTime date, String status) {
		super();
		this.id = id;
		this.faculties = faculty;
		this.class_schedule = classSchedule;
		this.date = date;
		this.status = status;
	}

	public FacultyAttendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Faculties getFaculty() {
		return faculties;
	}

	public void setFaculty(Faculties faculty) {
		this.faculties = faculty;
	}

	public ClassSchedule getClassSchedule() {
		return class_schedule;
	}

	public void setClassSchedule(ClassSchedule classSchedule) {
		this.class_schedule = classSchedule;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FacultyAttendance [id=" + id + ", faculty=" + faculties + ", classSchedule=" + class_schedule + ", date="
				+ date + ", status=" + status + "]";
	}
	

}
