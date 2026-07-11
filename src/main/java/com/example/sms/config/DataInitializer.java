package com.example.sms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.sms.entity.User;
import com.example.sms.repository.UserRepository;

@Configuration
public class DataInitializer implements CommandLineRunner {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PasswordEncoder encoder;
	
	public void run(String... args) {
		if(!repository.existsByRole("ADMIN")) {
			User admin = new User();
			admin.setName("Admin");
			admin.setEmail("admin@sms.com");
			admin.setPassword(encoder.encode("admin123"));
			admin.setPhone("6290679022");
			admin.setRole("ADMIN");
			
			admin.setCurrentSemester(null);
			admin.setDepartment(null);
			admin.setRollNumber(null);
			
			repository.save(admin);
		}
	}
}
