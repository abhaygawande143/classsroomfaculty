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

import com.abh.entity.Faculties;
import com.abh.service.Facultyservice;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

	@Autowired
	Facultyservice facultyservice;

	@GetMapping
	public List<Faculties> getallfaculties() {
		return facultyservice.getallfaculties();
	}
	@GetMapping("/{id}")
	public Faculties getfacultiesbyId(@PathVariable long id) {
		return facultyservice.getfacultiesbyId(id);
	}
	@PostMapping
	public String createfaculty(@RequestBody Faculties faculties) {
		return facultyservice.createfaculty(faculties);
	}
	@PutMapping("/{id}")
	public Faculties updatefaculty(@RequestBody Faculties facultiesdetails,@PathVariable long id) {
		Faculties faculties2= facultyservice.getfacultiesbyId(id);
		if(faculties2!=null) {
			faculties2.setFactname(facultiesdetails.getFactname());
			faculties2.setDepartId(facultiesdetails.getDepartId());
			faculties2.setEmail(facultiesdetails.getEmail());
			facultyservice.createfaculty(faculties2);
		}
		return faculties2;
	}
	@DeleteMapping("/{id}")
	public String deletefaculty(@PathVariable long id) {
		return facultyservice.deletefaculty(id);
		
	}

}
