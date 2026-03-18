package com.cg;


//starter file of project

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ComponentScan(com)          if want to read something from other package than cg
//@PropertySource("classpath:data.properties")     for reading specifically a data file
public class FirstSpringbootAppApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=SpringApplication.run(FirstSpringbootAppApplication.class, args);
		
		HelloWorld h1= ctx.getBean(HelloWorld.class);
		System.out.println(h1.sayHello("A"));
		
	}

}
