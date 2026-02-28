package com.labs;

import java.util.stream.Collectors;
import java.util.*;

public class EmployeeService {
	
	
	//q1
	public void getAvgSal() {
		double avg = EmployeeRepository.getEmployees().stream().map(e->e.getSalary()).collect(Collectors.averagingDouble(e->e));
		
		System.out.println(avg);
	}
	
	// q2
	public void getMaxSalofEmpInEachDept() {
		Map<String, Optional<Employee>> map = EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()!=null).collect(Collectors.groupingBy(e->e.getDepartment().getDepartmentName(),Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
				
		map.forEach((dept,emp)->System.out.println(dept + "  " + emp.get().getFirstName()));
				
	}
	
	// q3
	public void getTotSalPerDept() {
		Map<String,Double> map =EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()!=null).collect(Collectors.groupingBy(e->e.getDepartment().getDepartmentName(),Collectors.summingDouble(e->e.getSalary())));
				
		System.out.println(map);
	}
	
	//q4
	public void getEmpNameandSal() {
			EmployeeRepository.getEmployees().stream().map(e->e.getFirstName()+ " " +e.getLastName()+ "SAL: "+ e.getSalary()).forEach(System.out::println);
			
	}
	
	// q5
	public void sortEmpBySalDes() {
		List<Employee> list =EmployeeRepository.getEmployees().stream().sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
				
		list.forEach(e->System.out.println(e.getFirstName() + " " + e.getSalary()));
			
		
	}
		
		
		
	
}