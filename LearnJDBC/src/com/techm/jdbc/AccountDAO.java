package com.techm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {

	public static void main(String[] args)  {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mybd","root","1234abcd");
			//System.out.println(connection);// just checking that we made connection or not with database
			
			Statement statement = connection.createStatement();
			//int result = statement.executeUpdate("insert into account values(1,'Ghadi','Vidya',20000);");
			//System.out.println("number of rows inserted is :" +result);
			
			//int result = statement.executeUpdate("insert into account values(5,'Patil','Swara',70000);");
			//System.out.println("number of rows inserted is :" +result);
			
			//int result = statement.executeUpdate("update account set bal=12000 where accno=3");
			//System.out.println("Number of rows got upaded is :" +result);
			
			//int result = statement.executeUpdate("delete from account where accno=5");
			//System.out.println("Number of rows deleted is: " +result);
			
			ResultSet rs = statement.executeQuery("select * from account");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
