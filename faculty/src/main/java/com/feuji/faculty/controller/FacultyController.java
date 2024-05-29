package com.feuji.faculty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feuji.faculty.entity.Faculty;
import com.feuji.faculty.service.FacultyService;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
	
	@Autowired
	FacultyService facultyService;
     
	@PostMapping("/save")
	ResponseEntity<Faculty> add(@RequestBody Faculty faculty)
	{
		facultyService.add(faculty);
		return new ResponseEntity<Faculty>(faculty,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Faculty> get(@PathVariable int id)
	{
		Faculty faculty=facultyService.get(id);
		return new ResponseEntity<Faculty>(faculty,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	ResponseEntity<Faculty> update(@RequestBody Faculty faculty)
	{
		facultyService.update(faculty);
		return new ResponseEntity<Faculty>(faculty,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<String> delete(@PathVariable int id)
	{
		facultyService.delete(id);
		return new ResponseEntity<String>("DELETED",HttpStatus.OK);
	}
}
