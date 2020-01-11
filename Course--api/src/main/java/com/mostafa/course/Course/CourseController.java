package com.mostafa.course.Course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mostafa.course.Topic.Topic;

@RestController
public class CourseController {
	@Autowired
	CourseService courseservice;
	
	@RequestMapping(value="/topics/{id}/courses",method=RequestMethod.POST)
	public void add(@PathVariable("id") String id,@RequestBody Course c) {
		c.setTopic(new Topic(id,"",""));
		courseservice.add(c);
	}
	
	@RequestMapping(value="/topics/{id}/courses",method=RequestMethod.GET)
	public List<Course> getallcourses(@PathVariable("id") String id) {
	return courseservice.get(id);
	}
	@RequestMapping(value="/topics/{topicid}/courses/{id}")
	public Optional<Course> getcourse(@PathVariable("id") String id)
	{
		return courseservice.getc(id);
	}
	@RequestMapping(value="/topics/{topicid}/courses/{id}",method=RequestMethod.PUT)
	public void update(@PathVariable String topicid,@RequestBody Course c,@PathVariable String id) {
		Topic t=new Topic(topicid,"","");
		c.setTopic(t);
		courseservice.updatecourse(c);
	}
	@RequestMapping(value="/topics/{topicid}/courses/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
	
		courseservice.deletecourse(id);
	}
	
	
}
