package com.cg.dao;

import java.util.List;

import com.cg.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDao {
	
	private static EntityManagerFactory emf= Persistence.createEntityManagerFactory("employee-pu");
	
	// CREATE
    public String saveEmployee(Employee emp) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(emp);
        tx.commit();

        return "Employee Created";
    }

    // READ BY ID
    public Employee findEmployee(String empid) {

        EntityManager em = emf.createEntityManager();
        Employee emp = em.find(Employee.class, empid);

        return emp;
    }

    // READ ALL
    public List<Employee> getAll() {

        EntityManager em = emf.createEntityManager();

        List<Employee> list =em.createQuery("SELECT e FROM Employee e",Employee.class).getResultList();
                                

        em.close();
        return list;
    }

    // UPDATE
    public String updateEmployeeName(String empid, String newName) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Employee emp = em.find(Employee.class, empid);

        if (emp != null) {
            emp.setName(newName);
            tx.commit();
            return "Employee Updated";
        }

        tx.commit();
        return "Employee Not Found";
    }

    // DELETE
    public String deleteEmployee(String empid) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Employee emp = em.find(Employee.class, empid);

        if (emp != null) {
            em.remove(emp);
            tx.commit();
            return "Employee Deleted";
        }

        tx.commit();
        return "Employee Not Found";
    }

}
