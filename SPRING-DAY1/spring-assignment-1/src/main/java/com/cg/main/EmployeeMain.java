package com.cg.main;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;
import com.cg.bean.SBU;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =new  ClassPathXmlApplicationContext("bean.xml");
		
		//1-
//		Employee e1=(Employee)ctx.getBean("emp");
//		e1.emp_details();
		
		//2-
//		Employee e1=(Employee)ctx.getBean("emp");
//        e1.emp_SBU_details();
        
        //3-
//		SBU s1=(SBU)ctx.getBean("sbu");
//        s1.sbu_empList_details();
        
        //4-
        SBU s1=(SBU)ctx.getBean("sbu");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter eid:");  
        int id = sc.nextInt();
        
        Employee e = s1.getEmployee(id);
        
        if(e!=null) {
          System.out.println("eid:"+e.getEid());
          System.out.println("ename:"+e.getEname());
          System.out.println("esal:"+e.getSal());
          System.out.println("eage:"+e.getAge());
        }
		
		ctx.close();

	}

}
