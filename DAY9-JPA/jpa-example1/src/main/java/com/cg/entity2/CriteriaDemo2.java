package com.cg.entity2;

import java.util.List;

import com.cg.entity.Product;
import com.cg.entity2.Employee1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class CriteriaDemo2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee-pu");
        EntityManager em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);

        // Create single root
        Root<Employee1> root = cq.from(Employee1.class);

        // Select dept and count
        cq.multiselect(root.get("dept"), cb.count(root));
        cq.groupBy(root.get("dept"));

        List<Object[]> li = em.createQuery(cq).getResultList();

        for (Object[] obj : li) {
            System.out.println("Department: " + obj[0] + " Count: " + obj[1]);
        }
//        li.forEach(System.out::println);

//        em.close();
//        emf.close();
		
		
		

	}

}
