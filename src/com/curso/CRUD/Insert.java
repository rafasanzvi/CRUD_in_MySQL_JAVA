package com.curso.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// import java.sql.*; De esta forma se puede portar todo lo que tenga que ver con el paquete SQL

public class Insert {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/bdcurso";

		String user = "root";
		String pwd = "root";
		String sql = "insert into personas (nombre, apellidos, edad) values ('Rafael David', 'Melquiades', 0)"; // String query????

		
		try (Connection conexion = DriverManager.getConnection(url, user, pwd);
				Statement sentencia = conexion.createStatement();	
					) {
				sentencia.executeUpdate(sql);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}

}
