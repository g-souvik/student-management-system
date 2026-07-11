package com.example.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sms.entity.User;
import com.example.sms.service.UserService;

@RestController
@RequestMapping("/admin/students")
public class AdminStudentController {
	
	@Autowired
	private UserService service;
	
	@PostMapping
	public User addStudent(@RequestBody User newUser) {
		return service.addStudent(newUser);
	}
	
	@PutMapping("/{rollNumber}")
	public User updateStudent(@PathVariable String rollNumber,
							  @RequestBody User updatedUser) {
		return service.updateStudent(rollNumber, updatedUser);
	}
	
	@GetMapping("/{rollNumber}")
	public User getStudent(@PathVariable String rollNumber) {
		return service.getStudent(rollNumber);
	}
	
	@DeleteMapping("/{rollNumber}")
	public void deleteStudent(@PathVariable String rollNumber) {
		service.deleteStudent(rollNumber);
	}
	
	@GetMapping
	public List<User> searchStudent(@RequestParam String dept,
									@RequestParam String sem) {
		return service.searchStudent(dept, sem);
	}
}
