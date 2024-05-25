package org.sql;

public class CallableStatementImpl implements CallableStatement {
	@Override
	public void executeUpdate() {
		System.out.println("Callable Statement execute Update...");
	}

	@Override
	public void executeQuery() {
		System.out.println("Callabel Statement execute Query...");
	}
}
