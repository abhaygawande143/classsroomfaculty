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

import com.abh.entity.ClassSchedule;
import com.abh.service.ClassScheduleService;

@RestController
@RequestMapping("/classschedule")
public class ClassscheduleController {

	@Autowired
	private ClassScheduleService scheduleService;

	@GetMapping
	public List<ClassSchedule> getallclassschedule() {
		return scheduleService.getallclassschedule();

	}

	@GetMapping("/{id}")
	public ClassSchedule getschedulebyid(@PathVariable long id) {
		return scheduleService.getschedulebyid(id);

	}
	
	@PostMapping
	public void createschedule(@RequestBody ClassSchedule classSchedule) {
		scheduleService.createschedule(classSchedule);
		
	}
	@PutMapping("/{id}")
	public ClassSchedule updateschedule(@RequestBody ClassSchedule classScheduledetails,@PathVariable long id ) {
		ClassSchedule schedule =scheduleService.getschedulebyid(id);
		if(schedule!=null) {
			schedule.setClassroomid(classScheduledetails.getClassroomid());
			schedule.setDayofweek(classScheduledetails.getDayofweek());
			schedule.setEndtime(classScheduledetails.getEndtime());
			schedule.setStarttime(classScheduledetails.getStarttime());
			schedule.setSubjectid(classScheduledetails.getSubjectid());
			scheduleService.createschedule(schedule);
		}
		return schedule;
		
	}
	@DeleteMapping("/{id}")
	public String deletemschedule(@PathVariable long id) {
		scheduleService.deletemschedule(id);
		return "deleted..!!!";
	}

}
