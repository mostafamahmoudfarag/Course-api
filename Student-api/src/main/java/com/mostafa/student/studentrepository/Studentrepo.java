package com.mostafa.student.studentrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mostafa.student.model.Student;

public interface Studentrepo extends JpaRepository<Student,Integer> {

}
