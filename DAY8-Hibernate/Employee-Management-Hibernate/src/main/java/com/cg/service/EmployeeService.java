package com.cg.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import com.cg.dao.EmployeeDao;
import com.cg.entity.Employee;

public class EmployeeService {

    EmployeeDao dao = new EmployeeDao();

    public String createEmployee(String name, String email, LocalDate dob) {

        if (name == null || name.length() < 4) {
            return "Invalid Name";
        }

        String empid = name.substring(0, 3)
                + new Random().nextInt(1000);

        Employee emp = new Employee(empid, name, email, dob);

        return dao.saveEmployee(emp);
    }

    public Employee findById(String empid) {
        return dao.findEmployee(empid);
    }

    public List<Employee> getAll() {
        return dao.getAll();
    }

    public String updateName(String empid, String name) {
        return dao.updateEmployeeName(empid, name);
    }

    public String delete(String empid) {
        return dao.deleteEmployee(empid);
    }
}