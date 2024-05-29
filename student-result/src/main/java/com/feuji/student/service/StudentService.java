package com.feuji.student.service;

import java.util.List;

import com.feuji.student.entity.Student;

public interface StudentService {

	Student save(Student student);
	Student getById(String id);
	Student update(Student student);
	void delete(String id);
	List<Student> getAll();
}
