package com.feuji.faculty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feuji.faculty.entity.Faculty;
@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

}
