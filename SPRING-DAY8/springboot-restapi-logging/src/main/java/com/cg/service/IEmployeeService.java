package com.cg.service;

import java.util.List;

import com.cg.dto.EmployeeDTO;
//import com.cg.dto.StudentDTO;

public interface IEmployeeService {
	
    public EmployeeDTO createEmployee (EmployeeDTO edto);
	
	public List<EmployeeDTO> getAllEmployee();

}
