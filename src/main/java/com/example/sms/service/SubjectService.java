package com.example.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sms.entity.Subject;
import com.example.sms.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository repository;
	
	public Subject addSubject(Subject newSubject) {
		return repository.save(newSubject);
	}

	public Subject updateSubject(String subjectId, Subject updateSubject) {
		Subject subject = repository.findBySubjectId(subjectId);
		subject.setSubjectName(updateSubject.getSubjectName());
		subject.setSemester(updateSubject.getSemester());
		return repository.save(subject);
	}
	
	@Transactional
	public void deleteSubject(String subjectId) {
		repository.deleteBySubjectId(subjectId);
	}

	public List<Subject> viewSubject(Integer sem) {
		return repository.findBySemester(sem);
	}

}
