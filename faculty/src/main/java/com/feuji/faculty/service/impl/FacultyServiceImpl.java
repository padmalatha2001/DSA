package com.feuji.faculty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.faculty.entity.Faculty;
import com.feuji.faculty.repository.FacultyRepository;
import com.feuji.faculty.service.FacultyService;
@Service
public class FacultyServiceImpl implements FacultyService {

	@Autowired
	FacultyRepository facultyRepository;
	@Override
	public Faculty add(Faculty faculty) {
		
		facultyRepository.save(faculty);
		return faculty;
	}

	@Override
	public Faculty get(int id) {
		// TODO Auto-generated method stub
		return facultyRepository.findById(id).get();
	}

	@Override
	public Faculty update(Faculty faculty) {
		// TODO Auto-generated method stub
//		Faculty faculty1=facultyRepository.findById(faculty.getId()).get();
//		faculty1.setDesignation(faculty.getDesignation());
//		faculty1.setName(faculty.getName());
		facultyRepository.save(faculty);
		return faculty;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 facultyRepository.delete(facultyRepository.getById(id));;
	}

}
