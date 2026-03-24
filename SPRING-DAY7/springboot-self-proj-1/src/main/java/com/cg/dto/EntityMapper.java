package com.cg.dto;

import com.cg.entity.Student;

public class EntityMapper {
	
	public static Student toEntity(StudentDTO sdto) {
		return new Student(sdto.getId(),sdto.getName(),sdto.getEmail());
	}
	
	
    public static StudentDTO toDTO(Student s) {
		return new StudentDTO(s.getId(),s.getName(),s.getEmail());
	}

}
