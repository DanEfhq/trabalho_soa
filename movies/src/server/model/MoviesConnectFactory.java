package server.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MoviesConnectFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/nome do sua base aqui");
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
	
}
