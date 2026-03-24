package com.cg.service;

import java.util.List;

import com.cg.dto.StudentDTO;

public interface IStudentService {
	
	public StudentDTO createStudent (StudentDTO sdto);
	
	public List<StudentDTO> getAllStudent();
	public StudentDTO getStudentById(int id);
	public List<StudentDTO> getStudentByName(String name);
	
	public String deleteStudent(int id);
	
	public StudentDTO updateStudent(StudentDTO sdto);
	

}
