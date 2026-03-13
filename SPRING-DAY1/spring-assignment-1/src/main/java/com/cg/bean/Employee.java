package com.cg.bean;

public class Employee {
	
	private int eid;
	private String ename;
	private double sal;
	private String bu;
	private int age;
	
	//2-
	private SBU businessUnit;  
	
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//1-
//    public void emp_details() {
//    	System.out.println("Employee Details--");
//    	System.out.println("eid:"+eid);
//    	System.out.println("ename:"+ename);
//    	System.out.println("esal:"+sal);
//    	System.out.println("ebu:"+bu);
//    	System.out.println("eage:"+age);
//    
//    }
    
	//2-
//    public void emp_SBU_details() {
//    	System.out.println("Employee Details--");
//    	System.out.println("Employee [eid:"+eid+", ename:"+ename+", esal:"+sal+", ebu:"+bu+", eage:"+age+"]");
//    	
//    	System.out.println("SBU Details--");
//    	System.out.println("SBU [sbuId:"+businessUnit.getSbuId()+", sbuName:"+businessUnit.getSbuName()+", sbuHead:"+businessUnit.getSbuHead()+"]");
//    
//    }
    
	
    //3-in SBU Class

}
