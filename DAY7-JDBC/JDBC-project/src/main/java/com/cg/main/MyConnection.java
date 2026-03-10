package com.cg.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MyConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//1-load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded..");
			
			//2-establish connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","123456");
			System.out.println("Connected..");
			
			//3-create statement
			
			//statement type-1:statement, 2:preparedstatement, 3:callablestatement
			//operations-(3)common for all type
			//execute()-->DDL-->boolean
			//executeQuery()
			//executeUpdate()-->DML
			
//			Statement stat=con.createStatement();
//			ResultSet rs= stat.executeQuery("select * from emp");
//			rs.next();  //move to the next row
//			System.out.println(rs.getString(2));
			
//			while(rs.next()) {  
//			    System.out.println(rs.getString(2));   // for all names in col 2
//			    System.out.println(rs.getString("name")+"\t"+rs.getLong("phone")+"\t"+rs.getDate(4)); // for all names+phone +date in col 2,3,4
//			}
			
			//1-
			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter Customer ID");
//			
//			int cid=sc.nextInt();
//			
//			ResultSet rs = stat.executeQuery("select * from emp where id="+cid);
//		
//			if(rs.next())
//				System.out.println(rs.getString("name")+"\t"+rs.getLong("phone")+"\t"+rs.getDate(4));
//			else
//				System.out.println("Cust not found"); 
			
			//2-
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter Customer ID");
//			
//			int cid=sc.nextInt();
//			
//			PreparedStatement ps = con.prepareStatement("select * from emp where id=?");
//			ps.setInt(1, cid);
//			
//			ResultSet rs = ps.executeQuery();
//			if(rs.next())
//				System.out.println(rs.getString("name")+"\t"+rs.getLong("phone")+"\t"+rs.getDate(4));
//			else
//				System.out.println("Cust not found"); 
//				
		
			//3-
//			PreparedStatement ps = con.prepareStatement("select * from emp where ename=? and job=?");
//			ps.setString(1, "Priya");
//			ps.setString(2, "9828671850");
//			
//			ps.setString(1, "martin");
//			ps.setString(2, "salesman");
//			
//			ResultSet rs = ps.executeQuery();
//			if(rs.next())
//				System.out.println(rs.getString("ename")+"\t"+rs.getString("job")+"\t"+rs.getDate(5));
//			else
//				System.out.println("Employee not found"); 
			
			//4-(to create the data)
//			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?,?,?)") ;//5 col
//			ps.setInt(1,16);
//			ps.setString(2,"Priya");
//			ps.setString(3,"9477477474");
////			ps.setDate(4,new Date(System.currentTimeMillis()));  // for inserting curr date
//			ps.setString(4,"2026-02-2025");
//			ps.setInt(5,1200);
//			
//			int rows=ps.executeUpdate();
//			
//			if(rows>0)
//				System.out.println("CUST created"); 
			
			//5-operations on data(days till last visited)
//			Statement stat=con.createStatement();
//			ResultSet rs= stat.executeQuery("select * from emp");
//    	
//			
//			while(rs.next()) {  
//			    Date last_v_on =rs.getDate(4);
//			    LocalDate ld = last_v_on.toLocalDate();
//			    
////			    Period p = Period.between(ld, LocalDate.now());
//			    long days = ChronoUnit.DAYS.between(ld, LocalDate.now());  //difference in days
//			    
//			    
//			    System.out.println(rs.getString("name")+"\t"+rs.getLong("phone")+"\t"+p.getDays()); 
//			}
			
			//6-operations on data(delete data using emp id)
//			PreparedStatement ps = con.prepareStatement("DELETE from emp where empno = ?");
//			
//			ps.setInt(1, 7369);
//			int rows = ps.executeUpdate();
//			
//			if(rows>0)
//				System.out.println("emp deleted");
			
			//7-operations on data(update data using emp ename)
//			PreparedStatement ps = con.prepareStatement("UPDATE emp SET ename = ? WHERE id =?");
//			
//			ps.setString(1, "Priya");
//			ps.setInt(2, 7499);
//			
//			int rows = ps.executeUpdate();
//			
//			if(rows>0)
//				System.out.println("emp name updated succesfully");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("CUST not created"); 
			
		}

	}

}
