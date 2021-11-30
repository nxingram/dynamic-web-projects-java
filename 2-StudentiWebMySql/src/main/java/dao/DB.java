package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

//	private static final String HOST = "jdbc:mysql://localhost:3306/javadb";
	private static final String HOST = "jdbc:mysql://localhost:3306/generation";
	private static final String USER = "app_java";
	private static final String PASS = "java_2021";
	
	private static Connection conn;
	
	public static Connection connetti() {
		
		try {
			// carica forzatamente il driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// apre connessione al database solo se è nulla
			if(conn==null) {
				conn = DriverManager.getConnection(HOST, USER, PASS);				
				System.out.println("sei connesso al database");
			}
			
			
		} catch (SQLException e) {
			System.out.println("Problema nella connessione al database");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		DB db = new DB();
		DB.connetti();
	}
	
	
	
}
