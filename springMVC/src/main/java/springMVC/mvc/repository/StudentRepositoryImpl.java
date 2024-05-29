package springMVC.mvc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springMVC.mvc.entity.Student;
@Repository
public class StudentRepositoryImpl implements StudentRepository {

	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(student);
		return student;
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student=(Student) hibernateTemplate.find("select * from department.student where id="+id);
		return student;
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(student);
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(student);
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return (List<Student>) hibernateTemplate.loadAll(Student.class);
	}

}
