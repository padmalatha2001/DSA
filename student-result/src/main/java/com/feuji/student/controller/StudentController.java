package com.feuji.student.controller;

import java.util.List;

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

import com.feuji.student.entity.Student;
import com.feuji.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	@PostMapping("/save")
	ResponseEntity<Student> addStudent(@RequestBody Student student){
		
		studentService.save(student);
		return new ResponseEntity<Student> (student,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
    ResponseEntity<Student> getStudent(@PathVariable String id){
		
		Student student=studentService.getById(id);
		return new ResponseEntity<Student> (student,HttpStatus.OK);
	}

	@PutMapping("/update")
    ResponseEntity<Student> update(@RequestBody Student student){
		studentService.update(student);
		return new ResponseEntity<Student> (student,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
    ResponseEntity<String> delete(@PathVariable String id){
		
		studentService.delete(id);
		return new ResponseEntity<String> ("Deleted successfully",HttpStatus.OK);
	}


	@GetMapping("/getAll")
	ResponseEntity<List<Student>> getAll(){
		List<Student> list=studentService.getAll();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	

}
