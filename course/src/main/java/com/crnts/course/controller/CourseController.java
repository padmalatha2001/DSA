package com.crnts.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crnts.course.entity.Course;
import com.crnts.course.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	 CourseService  courseService;
	@PostMapping("/save")
	ResponseEntity<Course> addCourse(@RequestBody Course course){
		Course course1=courseService.add(course);
		return new ResponseEntity<Course>(course1,HttpStatus.CREATED);
	}
}
