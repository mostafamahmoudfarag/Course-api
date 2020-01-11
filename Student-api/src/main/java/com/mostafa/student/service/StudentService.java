package com.mostafa.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mostafa.student.model.Student;
import com.mostafa.student.studentrepository.Studentrepo;

@Service
public class StudentService {
@Autowired
Studentrepo repo;
public List<Student> findall(){
	return repo.findAll();
	
}
public void add(Student s)
{
	repo.save(s);

}
public void deleteStudent(int id) {
	repo.deleteById(id);
}
public void update(Student s)
{
	repo.save(s);
	
}
}
