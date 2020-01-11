package com.mostafa.course.Topic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
 
	@Autowired
	topicrepository repo;
	
	public List<Topic> findall(){
		return repo.findAll(); 

	}
	public Optional<Topic> findtopic(String id) {
		return repo.findById(id);
		
	}
	public void addtopic(Topic t)
	{
		repo.save(t);
		
		
	}
	public void deletetopic(String id) {
		repo.deleteById(id);
	}
	public void updatetopic(Topic t) {
		
		repo.save(t);
		
	}
	
	
}
