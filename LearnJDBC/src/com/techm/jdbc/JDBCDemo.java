package com.techm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	

	public static void main(String[] args) {
		
		
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		
		try {
		//Establishing connection Object
		Connection conn= DriverManager.getConnection(url ,"root","1234abcd");
		
		//Create a statement object to send to the database
		Statement statement = conn.createStatement();
		
		//Execute the statement object
		 //int rowAffected = statement.executeUpdate("insert into employees_tbl (id , name , dept , salary) values (2200 , 'Kanchana' , 'Sales' , 2900);");
		 int rowAffected = statement.executeUpdate("delete from employees_tbl where id=2100;");
		 
		 //System.out.println("statement is executed properly");
		 System.out.println("row affected :" +rowAffected);
		
		//Process the result
		//int salaryTotal1=0;
		/*while(resultSet.next()) {
			//Object salaryTotal1 = salaryTotal1 + Integer.parseInt (resultSet.getString("salary"));
			System.out.println(resultSet.getString("dept"));
		}*/
			//System.out.println(salaryTotal1);
		 
		}catch(SQLException e) {
			e.printStackTrace();
		}
			

	}

}
