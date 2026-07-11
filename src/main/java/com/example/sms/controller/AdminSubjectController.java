package com.example.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sms.entity.Subject;
import com.example.sms.service.SubjectService;

@RestController
@RequestMapping("/admin/subjects")
public class AdminSubjectController {
	
	@Autowired
	private SubjectService service;
	
	@PostMapping
	public Subject addSubject(@RequestBody Subject newSubject) {
		return service.addSubject(newSubject);
	}
	
	@PostMapping("/{subjectId}")
	public Subject updateSubject(@PathVariable String subjectId,
								 @RequestBody Subject updateSubject) {
		return service.updateSubject(subjectId, updateSubject);
	}
	
	@DeleteMapping("/{subjectId}")
	public void deleteSubject(@PathVariable String subjectId) {
		service.deleteSubject(subjectId);
	}
	
	@GetMapping
	public List<Subject> viewSubject(@RequestParam Integer sem) {
		return service.viewSubject(sem);
	}
}
