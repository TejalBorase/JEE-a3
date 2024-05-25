package org.sql;

public class Application {

	public static void main(String[] args) {
		Connection connection = DriverManager.getConnection();
		
		Statement stmt = connection.createStatement();
		
		stmt.executeQuery();
		stmt.executeUpdate();
		
		System.out.println("_____________________________________");
		
		PreparedStatement pstmt = connection.prepareStatement();
		
		pstmt.executeQuery();
		pstmt.executeUpdate();
		
		System.out.println("______________________________________");
		
		CallableStatement cstmt = connection.prepareCall();
		
		cstmt.executeQuery();
		cstmt.executeUpdate();
	}
}
