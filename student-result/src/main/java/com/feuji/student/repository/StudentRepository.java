package com.feuji.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feuji.student.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
