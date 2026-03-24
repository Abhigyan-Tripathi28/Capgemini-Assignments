package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IStudentRepo;
import com.cg.dto.EntityMapper;
import com.cg.dto.StudentDTO;
import com.cg.entity.Student;
import com.cg.exception.StudentNotFoundException;

@Service
public class StudentService implements IStudentService{
	
	@Autowired
	private IStudentRepo srepo;
	
	public StudentService(IStudentRepo srepo) {
		this.srepo=srepo;
	}

	@Override
	public StudentDTO createStudent(StudentDTO sdto) {
		// TODO Auto-generated method stub
		Student s=srepo.saveAndFlush(EntityMapper.toEntity(sdto));
		return EntityMapper.toDTO(s);
	}

	@Override
	public List<StudentDTO> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> sts=srepo.findAll();
		List<StudentDTO> stud = new ArrayList<>();
		sts.forEach(s->stud.add(EntityMapper.toDTO(s)));
		return stud;
	}

	@Override
	public StudentDTO getStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> op = srepo.findById(id);
		if(op.isPresent()) {
			return EntityMapper.toDTO(op.get());
		}
		
		throw new StudentNotFoundException("Student not found: "+ id);
	}

	@Override
	public List<StudentDTO> getStudentByName(String name) {
		// TODO Auto-generated method stub
		List<Student> sts=srepo.findByName(name);
		List<StudentDTO> stud = new ArrayList<>();
		sts.forEach(s->stud.add(EntityMapper.toDTO(s)));
		return stud;
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		if(srepo.findById(id).isPresent()) {
			srepo.deleteById(id);
			
			return "Student Deleted";
		}
//		return "Student Not Found";
		throw new StudentNotFoundException("Student not found: "+ id);
	}

	@Override
	public StudentDTO updateStudent(StudentDTO sdto) {
		// TODO Auto-generated method stub
		if(srepo.findById(sdto.getId()).isPresent()){
			Student s = srepo.saveAndFlush(EntityMapper.toEntity(sdto));
			return EntityMapper.toDTO(s);
		}
		return null;
	}
	
	

}
