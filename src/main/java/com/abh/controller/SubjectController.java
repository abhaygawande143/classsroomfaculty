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

import com.abh.entity.Subject;
import com.abh.service.SubjectServiceImpl;


@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectServiceImpl subjectService;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/{id}")
    public Subject getSubjectById(@PathVariable long id) {
        return subjectService.getSubjectById(id);
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        subjectService.saveSubject(subject);
        return subject;
    }

    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable long id, @RequestBody Subject subjectDetails) {
        Subject subject = subjectService.getSubjectById(id);
        if (subject != null) {
            subject.setSubnm(subjectDetails.getSubnm());
            subject.setCourse_id(subjectDetails.getCourse_id());
            subjectService.saveSubject(subject);
        }
        return subject;
    }

    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable long id) {
        subjectService.deleteSubject(id);
    }
}
