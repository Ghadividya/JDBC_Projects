package com.techm.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDAO {
	public static void main(String[] args) {
      try (Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mybd","root","1234abcd");
    	  Statement stmt = conn.createStatement();){
    	  stmt.addBatch("insert into account values(3,'Patil','Purvi',2000)");
    	  stmt.addBatch("insert into account values(4,'Dalavi','Purna',3000)");
    	  
    	  int[] result = stmt.executeBatch();
    	  for(int i=0; i<result.length;i++) {
    		  System.out.println(result[i]);
    	  }
      } catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
