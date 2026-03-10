package com.cg.entity;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employee-pu");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		PEmployee obj1 = new PEmployee();
		obj1.setName("Aman");
		obj1.setDob(LocalDate.of(2003,10, 16));
		obj1.setSalary(50000);
		
		CEmployee obj2 = new CEmployee();
		obj2.setName("Anant");
		obj2.setDob(LocalDate.of(2003,10, 16));
//		obj2.setSalary(50000);
		obj2.setPay_per_hour(6000);
		
		
		em.persist(obj1);
		em.persist(obj2);
		
		em.getTransaction().commit();
		
		
		// TODO Auto-generated method stub

	}

}
