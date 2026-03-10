package com.cg.entity;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

public class ProductMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employee-pu");
		EntityManager em=emf.createEntityManager();
		
//		em.getTransaction().begin();
		
//		TypedQuery<Product> q=em.createQuery("select p from Product p ", Product.class);
//		List<Product> li =q.getResultList();
		
//		TypedQuery<String> q=em.createQuery("select p.name from Product p ", String.class);
//		
//		List<String> li =q.getResultList();
		
//		TypedQuery<Object[]> q=em.createQuery("select p.name,p.price,p.mfd from Product p ", Object[].class);
//		
//		List<Object[]> li =q.getResultList();
//		
//		li.forEach(System.out.println(p[0]));
		
//		TypedQuery<ProductDTO> q=em.createQuery("select new ProductDTO(p.name,p.price,p.mfd )from Product p ", ProductDTO.class);
////		
//		List<ProductDTO> li =q.getResultList();
//		
//		li.forEach(System.out::println);
		
		TypedQuery<Product> q=em.createQuery("select p from Product p where p.name like : p ", Product.class);
		q.setParameter("p", "b%");
		List<Product> li =q.getResultList();
		
		li.forEach(System.out::println);

	}

}
