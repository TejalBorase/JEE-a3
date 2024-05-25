package org.sql;

public class PreparedStatementImpl implements PreparedStatement{

	@Override
	public void executeUpdate() {
		System.out.println("PreparedStatement execute Update...");
	}

	@Override
	public void executeQuery() {
		System.out.println("PreparedStatement execute Query...");
	}
}
