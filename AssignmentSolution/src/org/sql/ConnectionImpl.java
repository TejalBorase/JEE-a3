package org.sql;

public class ConnectionImpl implements Connection{

	@Override
	public Statement createStatement() {
		return new StatementImpl();
	}

	@Override
	public PreparedStatement prepareStatement() {
		return new PreparedStatementImpl();
	}

	@Override
	public CallableStatement prepareCall() {
		return new CallableStatementImpl();
	}

}
