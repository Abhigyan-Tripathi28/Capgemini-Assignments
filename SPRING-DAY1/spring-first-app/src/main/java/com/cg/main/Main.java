package com.cg.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.HelloWorld;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =new  ClassPathXmlApplicationContext("bean.xml");
		
//		HelloWorld h = new HelloWorld();
		
//		HelloWorld h=(HelloWorld)ctx.getBean("hello");
		
//		System.out.println(h.sayHello("A"));
		
		
		HelloWorld h1=(HelloWorld)ctx.getBean("hello");
		HelloWorld h2=(HelloWorld)ctx.getBean("hello");
		
		
	
//		h1.setName("A");
		System.out.println(h1.sayHello());
		System.out.println(h2.sayHello());
		
		System.out.println(h1.getLang());
//		((ClassPathXmlApplicationContext)ctx).close();
		
		ctx.close();
		

	}

}
