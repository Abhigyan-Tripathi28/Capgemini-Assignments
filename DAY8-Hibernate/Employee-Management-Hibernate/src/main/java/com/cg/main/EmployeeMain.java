package com.cg.main;

import java.time.LocalDate;
import java.util.List;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeService es = new EmployeeService();

        // CREATE
//        es.createEmployee("Ramesh", "ram@gmail.com",LocalDate.of(1998, 5, 10));
//        es.createEmployee("Gamesh", "gam@gmail.com",LocalDate.of(1999, 5, 10));
//        es.createEmployee("Laxman", "lax@gmail.com",LocalDate.of(1997, 5, 10));
        
               
        // READ
//        Employee e = es.findById("Ram385");
//        if (e != null)
//            System.out.println(e.getName());
//
//        // READ ALL
//        List<Employee> list = es.getAll();
//        list.forEach(System.out::println);
//
//        // UPDATE
//        es.updateName("Ram385", "Ram");
//
//        // DELETE
        es.delete("Gam429");
    }
}
