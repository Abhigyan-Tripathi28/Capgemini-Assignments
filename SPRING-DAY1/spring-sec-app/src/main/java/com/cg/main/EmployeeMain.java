package com.cg.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;



public class EmployeeMain {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =new  ClassPathXmlApplicationContext("bean.xml");
		
		Employee e1=(Employee)ctx.getBean("emp");
		
		e1.emp_details();
		
		ctx.close();
		

	}

}
