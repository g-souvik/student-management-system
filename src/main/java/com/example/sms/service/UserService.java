package com.example.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sms.entity.User;
import com.example.sms.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PasswordEncoder encoder;

	public User addStudent(User newUser) {
		newUser.setRole("STUDENT");
		newUser.setPassword(encoder.encode(newUser.getPassword()));
		return repository.save(newUser);
	}

	public User updateStudent(String rollNumber, User updatedUser) {
		User user = repository.findByRollNumber(rollNumber);
		user.setName(updatedUser.getName());
		user.setRollNumber(updatedUser.getRollNumber());
		user.setEmail(updatedUser.getEmail());
		user.setPhone(updatedUser.getPhone());
		user.setDepartment(updatedUser.getDepartment());
		user.setCurrentSemester(updatedUser.getCurrentSemester());
		user.setPassword(encoder.encode(updatedUser.getPassword()));
		return repository.save(user);
	}

	public User getStudent(String rollNumber) {
		return repository.findByRollNumber(rollNumber);
	}
	
	@Transactional
	public void deleteStudent(String rollNumber) {
		repository.deleteByRollNumber(rollNumber);
	}

	public List<User> searchStudent(String dept, String sem) {
		return repository.findByDepartmentAndCurrentSemester(dept, sem);
	}
}
