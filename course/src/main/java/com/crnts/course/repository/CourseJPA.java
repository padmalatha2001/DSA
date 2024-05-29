package com.crnts.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crnts.course.entity.Course;

@Repository
public interface CourseJPA extends JpaRepository<Course, Integer> {

}
