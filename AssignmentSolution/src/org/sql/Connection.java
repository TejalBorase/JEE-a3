package org.sql;

public interface Connection {

	Statement createStatement();
	
	PreparedStatement prepareStatement();
	
	CallableStatement prepareCall();
}
