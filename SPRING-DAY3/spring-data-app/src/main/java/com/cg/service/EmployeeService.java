package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private IEmployeeRepo erepo;
	
	public String createEmployee(Employee emp) {
		
		Employee e=erepo.saveAndFlush(emp);
		
		return "Employee Created with eid:"+e.getEid();
	}
	
	public List<Employee> getAllEmployee(){
		return erepo.findAll();
	}
	
	public Employee getEmployee(int eid) {
		Employee e =erepo.findById(eid).orElse(null);
		return e;
		
	}
	
	public String removeEmployee(int eid) {
		erepo.deleteById(eid);
		return "Emp deleted";
	}
	
	
	public String updateEmployee(Employee e) {
		erepo.saveAndFlush(e);
		return "emp updated";
		
	}
	
	public List<Employee> getEmployeeByName(String name){
		return erepo.findByName(name);
	}
	
	public List<Employee> getEmpBySal(double sal){
		return erepo.findBySal(sal);
	}
	
	public List<Employee> getEmpbySalDesc(String name){
		return erepo.findByNameOrderBySalDesc(name);
	}
	

}
