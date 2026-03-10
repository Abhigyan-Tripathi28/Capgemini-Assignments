package com.cg.entity;

import java.util.List;
//import java.util.function.Predicate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class CriteriaDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employee-pu");
		EntityManager em=emf.createEntityManager();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq =cb.createQuery(Product.class);
		
		Root<Product> r=cq.from(Product.class);
//		cq.select(r);
		
//		cq.select(r).where(cb.lessThan(r.get("price"), 500));                // query1
//		cq.select(r).where(cb.like(r.get("name"), "B%"));                    // query2
		 
		// query3
		Predicate con1=cb.lessThan(r.get("price"), 500); 
		Predicate con2=cb.greaterThan(r.get("price"), 100); 
		cq.select(r).where(cb.and(con1,con2)); 
		
		// query4
		cq.select(r).orderBy(cb.desc(r.get("name")));
		
		List<Product> li= em.createQuery(cq).getResultList();	
		li.forEach(System.out::println);
//		li.forEach(p->System.out.println(p));
		

	}

}
