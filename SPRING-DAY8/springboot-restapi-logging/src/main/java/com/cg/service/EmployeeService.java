package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
//import com.cg.dto.StudentDTO;
import com.cg.entity.Employee;
//import com.cg.entity.Student;
import com.cg.repo.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	private IEmployeeRepo erepo;

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO edto) {
		// TODO Auto-generated method stub
		Employee e=erepo.saveAndFlush(EntityMapper.toEntity(edto));
		return EntityMapper.toDTO(e);
//		return null;
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> sts=erepo.findAll();
		List<EmployeeDTO> emps = new ArrayList<>();
		sts.forEach(e->emps.add(EntityMapper.toDTO(e)));
		return emps;
//		return null;
	}

}
