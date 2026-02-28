package com.labs;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		
		//q1
		es.getAvgSal();
		
		//q2
		es.getMaxSalofEmpInEachDept();
		
		//q3
		es.getTotSalPerDept();
		
		//q4
		es.getEmpNameandSal();
		
		//q5
		es.sortEmpBySalDes();
	}
}