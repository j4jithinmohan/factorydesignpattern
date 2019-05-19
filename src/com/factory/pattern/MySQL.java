package com.factory.pattern;

public class MySQL implements Database {

	@Override
	public void getConnection() {
		System.out.println("MySQL db connected");
	}

}
