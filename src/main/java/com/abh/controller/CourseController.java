package com.abh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abh.entity.Courses;
import com.abh.service.CoursesService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	CoursesService coursesService;

	@GetMapping
	public List<Courses> getallCoursesnames() {
		return coursesService.getallCoursesnames();

	}
	@GetMapping("/{id}")
	public Courses getCoursebyId(@PathVariable int id) {
		return coursesService.getCoursebyId(id);
		
	}

	@PostMapping
	public Courses insertcoursedata(@RequestBody Courses courses) {
		coursesService.updatecoursedata(courses);
		return courses;

	}
	 @PutMapping("/{id}")
	    public Courses updateCourse(@PathVariable int id, @RequestBody Courses courseDetails) {
	        Courses course = coursesService.getCoursebyId(id);
	        if (course != null) {
	            course.setCoursenm(courseDetails.getCoursenm());
	            coursesService.updatecoursedata(course);
	        }
	        return course;
	    }
	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable int id) {
		coursesService.deleteCourse(id);
		
	}
	
}