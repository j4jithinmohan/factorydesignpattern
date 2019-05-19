package com.factory.pattern;

public class GetConnection {
	public static void main(String args[]) {
		DatabaseFactory factory = new DatabaseFactory();
		Database database = factory.getDbInstance("mysql");
		if (database != null)
			database.getConnection();
		else
			System.out.println("Database not found");
	}
}
