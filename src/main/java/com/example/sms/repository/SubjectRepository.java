package com.example.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

	List<Subject> findBySemester(Integer sem);

	Subject findBySubjectId(String subjectId);

	void deleteBySubjectId(String subjectId);

}
