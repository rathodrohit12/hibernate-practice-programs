package com.rohit.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection connection = null;

	public static synchronized Connection getConnection() {

		if (connection == null) {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
				return connection;
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {

			return connection;
		}
		return connection;

	}

}
