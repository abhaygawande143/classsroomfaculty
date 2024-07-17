package com.abh.service;

import com.abh.entity.Subject;
import com.abh.dao.SubjectDAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubjectServiceImpl  {

    @Autowired
    private SubjectDAOImpl subjectDAO;

    @Transactional(readOnly = true)
    public List<Subject> getAllSubjects() {
        return subjectDAO.getAllSubjects();
    }

    @Transactional(readOnly = true)
    public Subject getSubjectById(Long id) {
        return subjectDAO.getSubjectById(id);
    }

    @Transactional
    public void saveSubject(Subject subject) {
        subjectDAO.saveSubject(subject);
    }

    @Transactional
    public void deleteSubject(Long id) {
        subjectDAO.deleteSubject(id);
    }
}
