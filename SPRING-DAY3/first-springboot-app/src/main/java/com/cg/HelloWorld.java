package com.cg;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	public String sayHello(String name) {
//		System.out.println("");
		return "hi "+ name;
	}

}
