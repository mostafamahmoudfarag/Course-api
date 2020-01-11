package com.mostafa.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mostafa.student.model.Student;
import com.mostafa.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	@RequestMapping(value="/students",method=RequestMethod.GET)
	public List<Student> getallStudents()
	{
		return service.findall();
		
	}
	@RequestMapping(value="/students",method=RequestMethod.POST)
	public void addStudent (@RequestBody Student s)
	{
		
		service.add(s);
	}
	@RequestMapping(value="/students/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id)
	{
		service.deleteStudent(id);
		
	}
	
	@RequestMapping(value="/students",method=RequestMethod.PUT)
	public void updateStudent(@RequestBody Student s)
	{
		
		service.update(s);
		
		
	}

	
	
	
}
