package com.cg.main;

import java.time.LocalDate;
import java.util.List;

//import org.hibernate.mapping.List;

import com.cg.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Product p = new Product(102,"Galaxy",56000,10,LocalDate.of(2026, 1, 10));
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//		EntityManager em=emf.createEntityManager();
//		
//		EntityTransaction tx=em.getTransaction();
//		
//		tx.begin();
//		
//		em.persist(p);
//		tx.commit();
//		
//		System.out.println("Product Created...");
		
		
		//2-
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//		EntityManager em=emf.createEntityManager();
//		
//		Product p = em.find(Product.class, 102);
//		
//	    System.out.println(p.getName());
//		
//		System.out.println("Product Created...");
		
		//3-
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//		EntityManager em=emf.createEntityManager();
//		em.getTransaction().begin();
//		
//		Product p = em.find(Product.class, 102);
//		p.setPrice(1000);
//		
//	    if(p!=null) {
//	    	System.out.println(p);
//	    }
//	    
//	    em.getTransaction().commit();
		
		//4-
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//		EntityManager em=emf.createEntityManager();
//		em.getTransaction().begin();
//		
//		Product p = em.find(Product.class, 102);
//		
//	    if(p!=null) {
//		    em.remove(p);
//	    	System.out.println(p);
//	    }
//	    
//	    em.getTransaction().commit();
		
		//5-
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//		EntityManager em=emf.createEntityManager();
//		
//		List<Product> li=em.createQuery("select p from Product p").getResultList();
//		li.forEach(p->System.out.println(p));
	    	
		
		

	}

}
