package com.example.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sms.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByRole(String string);

	User findByEmail(String username);

	List<User> findByDepartmentAndCurrentSemester(String dept, String sem);

	User findByRollNumber(String rollNumber);

	void deleteByRollNumber(String rollNumber);

}
