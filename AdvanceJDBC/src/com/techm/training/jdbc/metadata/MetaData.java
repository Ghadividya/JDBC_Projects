package com.techm.training.jdbc.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaData {
	public static void main(String[] args) {
	      try (Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mybd","root","1234abcd");
	    	  Statement stmt = conn.createStatement();){
	    	 ResultSet resultSet = stmt.executeQuery("select * from account");
	    	 ResultSetMetaData metaData = resultSet.getMetaData();
	    	 int count = metaData.getColumnCount();
	    	 
	    	 for(int i=1;i<=count;i++) {
	    		 System.out.println(metaData.getColumnName(i));
	    		 System.out.println(metaData.getColumnTypeName(i));
	    	 }
	    	 
	      } catch (SQLException e) {
			e.printStackTrace();
		}
		}

	}


