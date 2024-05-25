package org.sql;

public class DriverManager {

	public static Connection getConnection() {
		return new ConnectionImpl();
	}
}
