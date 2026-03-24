package com.cg.dto;

import com.cg.entity.Employee;

//import com.cg.entity.Student;

public class EntityMapper {
	
	public static Employee toEntity(EmployeeDTO edto) {
		return new Employee(edto.getEid(),edto.getName());
	}
	
	
    public static EmployeeDTO toDTO(Employee e) {
		return new EmployeeDTO(e.getEid(),e.getName());
	}

}
