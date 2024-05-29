package com.feuji.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.student.entity.Student;
import com.feuji.student.repository.StudentRepository;
import com.feuji.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return student;
	}
	@Override
	public Student getById(String id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}
	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		Student student1=studentRepository.getById(student.getId());
		student1.setCgpa(student.getCgpa());
		student1.setBranch(student.getBranch());
		student1.setName(student.getName());
		studentRepository.save(student1);
		return student1;
	}
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		studentRepository.delete(studentRepository.getById(id));
	}
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
