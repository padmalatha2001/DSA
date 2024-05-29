package com.feuji.faculty.service;

import com.feuji.faculty.entity.Faculty;

public interface FacultyService {
	
	Faculty add(Faculty faculty);
	Faculty get(int id);
	Faculty update(Faculty faculty);
	void delete(int id);

}
