package com.crnts.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crnts.course.entity.Course;
import com.crnts.course.repository.CourseJPA;
@Service
public class CourseServiceImpl implements CourseService {

	  @Autowired
	  CourseJPA courseJPA;
	
	@Override
	public Course add(Course course) {
		// TODO Auto-generated method stub
		return courseJPA.save(course);
	}

	@Override
	public Course get(int id) {
		// TODO Auto-generated method stub
		return courseJPA.getById(id);
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		courseJPA.save(course);  
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		courseJPA.delete(courseJPA.getById(id));
	}

}
