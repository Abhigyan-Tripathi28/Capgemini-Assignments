package com.cg.bean;

import java.util.List;

public class SBU {
	
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	
	//3-
	private List<Employee> empList;   
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	
	//3-
	public void sbu_empList_details() {
    	System.out.println("SBU Details--");
    	System.out.println("SBU [sbuId:"+sbuId+", sbuName:"+sbuName+", sbuHead:"+sbuHead+"]");
    	
    	System.out.println("Employee Details--");
    	for(Employee e:empList) {
			System.out.println("Employee [eid:"+e.getEid()+", ename:"+e.getEname()+", esal:"+e.getSal()+", eage:"+e.getAge()+"]");             
		}
    	
    }
	
	//4-
	public Employee getEmployee(int id) {
		
		for(Employee e:empList) {
			if(e.getEid()==id) return e;
		}
		
		return null;
	}
	
	

}
