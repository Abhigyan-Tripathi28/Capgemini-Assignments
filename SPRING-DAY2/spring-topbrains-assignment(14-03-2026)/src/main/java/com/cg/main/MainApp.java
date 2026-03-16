package com.cg.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Librarian;

public class MainApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =new  ClassPathXmlApplicationContext("bean.xml");
		
		Librarian l1= (Librarian)ctx.getBean("lib");
		
		l1.issueBook();
		
		ctx.close();

	}

}
