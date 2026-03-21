package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	private IEmployeeRepo erepo;
	
	public List<Employee> getEmp(){
		return erepo.findAll();
	}

	@Override
	public Employee getEmployee(int eid) {
		// TODO Auto-generated method stub
		Employee e = erepo.findById(eid).orElse(null);
		
		return e;
	}

	@Override
	public String removeEmployee(int eid) {
		
		erepo.deleteById(eid);
		return "Emp deleted";
	}

	@Override
	public Employee createEmp(Employee e) {
		
		return erepo.saveAndFlush(e);
	}

	@Override
	public String updateEmployee(Employee e) {
		
		erepo.saveAndFlush(e);
		return "emp updated";
	}
	
	
	
	
	
	

}
