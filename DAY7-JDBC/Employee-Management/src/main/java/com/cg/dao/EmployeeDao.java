package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;

public class EmployeeDao implements IEmployeeDao{
	private static Connection con;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String saveEmployee(Employee emp) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setString(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getDob());
			int rows=ps.executeUpdate();
			if(rows>0)
				return "Employee Created";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Employee Not Created";
	}

	@Override
	public Employee findEmployee(String empid) {

		try {
			PreparedStatement ps =con.prepareStatement("SELECT * FROM employee WHERE empid = ?");
			ps.setString(1, empid);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Employee emp = new Employee(rs.getString("name"),rs.getString("email"),rs.getString("dob"));
				emp.setEmpid(rs.getString("empid"));
				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAll() {

	    List<Employee> l1 = new ArrayList<>();

	    try {
	        PreparedStatement ps =con.prepareStatement("SELECT * FROM employee");
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Employee emp = new Employee( rs.getString("name"),rs.getString("email"), rs.getString("dob"));   
	            emp.setEmpid(rs.getString("empid"));
	            l1.add(emp);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return l1;
	}

	@Override
	public String updateEmployeeName(String empid, String newName) {

	    try {
	        PreparedStatement ps =con.prepareStatement("UPDATE employee SET name = ? WHERE empid = ?");
	        ps.setString(1, newName);
	        ps.setString(2, empid);

	        int rows = ps.executeUpdate();

	        if (rows > 0) {
	            return "Employee Name Updated";
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return "Employee Not Found";
	}

	@Override
	public String deleteEmployee(String empid) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("delete from employee where empid=?");
			ps.setString(1, empid);
			
			int rows = ps.executeUpdate();
			
			if(rows>0) {
				return "Employee Deleted";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Employee Not Found";
	}

}