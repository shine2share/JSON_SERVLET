package com.ducky.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection(String user, String password) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle JDBC Driver Registered.");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", user, password);
			if(con!=null){
				System.out.println("Success!");
			} else {
				System.out.println("Failed!");
			}
		} catch (Exception e) {
			System.out.println("Connection Failed! " + e);
			System.exit(0);
		}
		return con;
	}
}
