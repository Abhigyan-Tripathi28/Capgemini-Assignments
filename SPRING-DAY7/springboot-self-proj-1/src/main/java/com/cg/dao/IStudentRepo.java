package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Student;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer>{
	
	public List<Student> findByName (String name);

}
