package com.factory.pattern;

public class DatabaseFactory {
	public Database getDbInstance(String dbType) {
		if (dbType.equals("oracle"))
			return new Oracle();
		else if (dbType.equals("mysql"))
			return new MySQL();
		else
			return null;

	}
}
