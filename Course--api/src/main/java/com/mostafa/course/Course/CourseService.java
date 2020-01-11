package com.mostafa.course.Course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mostafa.course.Topic.Topic;
import com.mostafa.course.Topic.topicrepository;
@Service
public class CourseService {
@Autowired
Courserepository repo;



public void add(Course c)
{
	repo.save(c);
	
}
public List<Course> get(String id){
	return repo.findByTopicId(id);

}
public Optional<Course> getc(String id) {
	return repo.findById(id);
}
public void updatecourse(Course t) {
	repo.save(t);
	
}
public void deletecourse(String id) {
	repo.deleteById(id);
}
}
