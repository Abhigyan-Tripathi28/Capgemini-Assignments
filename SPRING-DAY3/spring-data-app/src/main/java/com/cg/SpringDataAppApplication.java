package com.cg;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import com.cg.service.EmployeeService;

@SpringBootApplication  //This is a combo annotation
                        //This is why you didn’t write XML config.
public class SpringDataAppApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run()-->Starts Spring Boot
		ApplicationContext ctx=SpringApplication.run(SpringDataAppApplication.class, args);
		
		//ctx.getBean(IEmployeeRepo.class)-->Spring gives you Repository object
		//                                -->You didn’t create it → Spring created it (Dependency Injection)
//		IEmployeeRepo erepo = ctx.getBean(IEmployeeRepo.class);
//		
//		//erepo.save(...)-->Saves object into DB
//		erepo.save(new Employee("RAM",LocalDate.of(2002, 1, 12),1000));
//		System.out.println("Done");
		
		EmployeeService es=ctx.getBean(EmployeeService.class);
		
		System.out.println(es.createEmployee(new Employee("LAXMAN",LocalDate.of(2003, 1, 16),2000)));
		
//		es.getAllEmployee().forEach(System.out::println);
		
//		System.out.println(es.getEmployee(1));
		
//		System.out.println(es.removeEmployee(2));
		
//		System.out.println(es.updateEmployee(new Employee("LAXMAN",LocalDate.of(2003, 1, 12),2000)));
		
		//find emp by name and sal
		
//		es.getEmployeeByName("RAM").forEach(System.out::println);
		
//		es.getEmpBySal(1500).forEach(System.out::println);
		
//		es.getEmpbySalDesc("RAM").forEach(System.out::println);
	}

}
