package br.com.sqlite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unused")
			Connection c;
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}
}
