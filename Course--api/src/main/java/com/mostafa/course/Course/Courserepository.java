package com.mostafa.course.Course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Courserepository extends JpaRepository<Course, String> {

	public List<Course> findByTopicId(String id);
	
	
}
