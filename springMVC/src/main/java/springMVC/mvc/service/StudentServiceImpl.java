package springMVC.mvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVC.mvc.entity.Student;
import springMVC.mvc.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired 
	private StudentRepository stdRepository;
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return stdRepository.save(student);
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return stdRepository.getById(id);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		stdRepository.update(student);
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		stdRepository.delete(student);
		
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return stdRepository.getAll();
	}

}
