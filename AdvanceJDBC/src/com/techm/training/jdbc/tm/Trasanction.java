package com.techm.training.jdbc.tm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Trasanction {
	public static void main(String[] args) {
		Connection conn = null;
	

	 try {
		  conn=DriverManager.getConnection("jdbc:mysql://localhost/mybd","root","1234abcd");
	 
	    	  Statement stmt = conn.createStatement();
		     conn.setAutoCommit(true);
	    	 stmt.executeUpdate("update account set bal=bal-500 where accno=2");
	    	 
	    	 stmt.executeUpdate("update account set bal=bal+500 where accno=3");
	    	 conn.commit();
	      } catch (SQLException e) {
	    	  e.printStackTrace();
	    	  try {
	    		  conn.close();
	    		  conn.rollback();
	    	  
		}catch(SQLException e1) {
			e.printStackTrace();
		}
	
		}

	}
}



