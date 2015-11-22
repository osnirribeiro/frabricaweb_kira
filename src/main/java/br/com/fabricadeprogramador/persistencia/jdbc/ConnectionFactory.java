package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
	public static Connection getConnection(){
	
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaWeb",
			"postgres", 
			"123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
