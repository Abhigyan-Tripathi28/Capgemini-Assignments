package com;

import java.util.logging.Logger;

/**
* @author Abhi
*/
public class EmployeeMain {
	
	/**
	* 
	*/
	private static final Logger LOGGER= Logger.getLogger("EmployeeMain");
	
	/**
	* @param args
	*/
	public static void main(String[] args) {
		
		final Employee employee=new Employee();
		employee.setEid(101);
		employee.setName("Aman");
		employee.setEmail("aman@gmail.com");
		
		LOGGER.fine("Name-->"+employee.getName());
		
	

	}

}
