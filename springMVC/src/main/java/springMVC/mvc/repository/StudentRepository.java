package springMVC.mvc.repository;

import java.util.List;

import springMVC.mvc.entity.Student;

public interface StudentRepository {

	public Student save(Student student);
	Student getById(int id);
	void update(Student student);
	void delete(Student student);
	List<Student> getAll();
	
}
