package com.example.demo.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {
	
	public List<Course> fingByName(String name);
	public List<Course> fingByTopicId(String topicId);
	
}
