package com.mostafa.course.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface topicrepository extends  JpaRepository<Topic,String>{

}
