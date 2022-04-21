package com.connections;

import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;


public class Demo {
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				try {
					DriverManager.registerDriver(new OracleDriver()); //This is for loading the odbc driver
					System.out.println("Driver loaded Successfully");  
					DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","tushar88"); //connecting to the database
					System.out.println("Connection Successful");
				} catch (SQLException e) {
					System.out.println("Some problem in connection");


					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
	}
}

