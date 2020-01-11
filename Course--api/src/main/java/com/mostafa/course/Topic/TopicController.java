package com.mostafa.course.Topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicService service;
	
	
	@RequestMapping("/")
	public String print() {
		return "hello world";
	}
	@RequestMapping(value="/topics")
	public List<Topic> getallTopics(){
	return service.findall();	
	}
	
	@RequestMapping(value="/topics/{id}")
	public Optional<Topic> getspecifictopic(@PathVariable("id") String id ){
	return service.findtopic(id);
	}
	@RequestMapping(value="/topics",method=RequestMethod.POST)
	public void addtopic(@RequestBody Topic t) {
		
		service.addtopic(t);
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable("id") String id ){
	service.deletetopic(id);
	}
	@RequestMapping(value="/topics",method=RequestMethod.PUT)
	public void  updatetopic(@RequestBody Topic t){
	
		service.updatetopic(t);
	}

}
