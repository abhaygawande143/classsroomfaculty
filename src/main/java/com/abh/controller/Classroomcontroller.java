package com.abh.controller;

import java.util.ArrayList;
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

import com.abh.entity.Classroom;
import com.abh.service.ClassroomService;

@RestController
@RequestMapping("/clsroom")
public class Classroomcontroller {

	@Autowired
	private ClassroomService classroomService;

	@GetMapping("/allclassrooms")
	public List<Classroom> getallclassroom() {
		return classroomService.getallclassroom();

	}

	@GetMapping("/{id}")
	public ArrayList<String> getclassroombyId(@PathVariable int id) {
		return classroomService.getclassroombyId(id);

	}

	@PostMapping("/insert")
	public void insertdata(@RequestBody Classroom classroom) {
		 classroomService.insertdata(classroom);

	}
	@PutMapping("/update")
	public void updatedata(@RequestBody Classroom classroom) {
		classroomService.updatedata(classroom);
		
	}
	@DeleteMapping("/delete")
	public void deletedata(@RequestBody Classroom classroom) {
		classroomService.deletedata(classroom);
		
	}

}
