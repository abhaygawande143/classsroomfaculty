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

import com.abh.entity.Department;
import com.abh.service.DepartService;

@RestController
@RequestMapping("/department")
public class DepartController {
	
	@Autowired
	DepartService departService;
	
	
	@GetMapping
	public List<Department> getalldepartment() {
		return departService.getalldepartment();
		
	}
	@GetMapping("/{id}")
	public Department getdepartmentbyId(@PathVariable long id) {
		return departService.getdepartmentbyId(id);
		
	}
	
	@PostMapping
	public String createdep(@RequestBody Department department) {
		return departService.createdep(department);
		
	}
	@PutMapping("{id}")
	public Department updatedep(@RequestBody Department departmentdetails,@PathVariable long id) {
		Department department= departService.getdepartmentbyId(id);
		if(department!=null) {
			department.setDepnm(departmentdetails.getDepnm());
			departService.createdep(department);
		}
		
		return department;
		
	}
	@DeleteMapping("/{id}")
	public String deletedepartment(@PathVariable long id) {
		departService.deletedepartment(id);
		return "Deleted....!!!";
	}
	

}
