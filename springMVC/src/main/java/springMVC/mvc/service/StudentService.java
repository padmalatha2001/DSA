package springMVC.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import springMVC.mvc.entity.Student;

@Service
public interface StudentService {

	public Student save(Student student);
	Student getById(int id);
	void update(Student student);
	void delete(Student student);
	List<Student> getAll();
}
