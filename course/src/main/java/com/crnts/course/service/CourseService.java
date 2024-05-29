package com.crnts.course.service;

import com.crnts.course.entity.Course;

public interface CourseService {
 
	Course add(Course course);
	Course get(int id);
	void update(Course course);
	void delete(int id);
}
