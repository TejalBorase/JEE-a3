package org.sql;

public class StatementImpl implements Statement{

	@Override
	public void executeUpdate() {
		System.out.println("Statement execute Update...");
	}

	@Override
	public void executeQuery() {
		System.out.println("Statement execute Query...");
	}

}
