package com.cg.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.cg.entity.Employee;

public interface IEmployeeService {
	
	public List<Employee> getEmp();
	
	public Employee getEmployee(int eid);
	
	public String removeEmployee(int eid);
	
	public Employee createEmp(Employee e);
	
	public String updateEmployee(Employee e); 

}
