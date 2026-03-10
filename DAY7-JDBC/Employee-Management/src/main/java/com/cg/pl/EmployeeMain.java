package com.cg.pl;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		IEmployeeService es=new EmployeeService();
		
		//1-
		
//		String result=es.createEmployee(new Employee("Rama", "ram@gmail.com", "1981-06-26"));
//		System.out.println(result);
		
//		// Employee 2
//        Employee e2 = new Employee("Shyam", "shyam@gmail.com", "1990-08-15");
//        System.out.println(es.createEmployee(e2));
//
//        // Employee 3
//        Employee e3 = new Employee("Mohan", "mohan@gmail.com", "1995-12-10");
//        System.out.println(es.createEmployee(e3));
		
		//2-
//		Employee emp = es.findById("Moh758");
//
//		if (emp != null) {
//			System.out.println("Employee Found");
//			System.out.println(emp.getEmpid());
//			System.out.println(emp.getName());
//			System.out.println(emp.getEmail());
//			System.out.println(emp.getDob());
//		} else {
//			System.out.println("Employee Not Found");
//		}
		
		//3-
//		System.out.println("All Employees:");
//		List<Employee> l1 = es.getAllEmployee();
//		for (Employee e : l1) {
//		    System.out.println(e.getEmpid() + "  " +e.getName() + "  " +e.getEmail() + "  " +e.getDob());    
//		}
		
		//4-
//		String result = es.updateEmployeeName("Ram948", "Ram Kumar");
//		System.out.println(result);
		
		//5-
//		String result=es.removeEmployee("Moh758");
//		System.out.println(result);

	}

}