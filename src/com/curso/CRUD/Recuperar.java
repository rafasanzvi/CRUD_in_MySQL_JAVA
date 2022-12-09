package com.curso.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Recuperar {

	public static void main(String[] args) {
		

		String url = "jdbc:mysql://localhost:3306/bdcurso";

		String user = "root";
		String pwd = "root";
		String query = "select * from personas";
		//String sql = "insert into personas (nombre, apellidos, edad) values ('Rafael David', 'Melquiades', 0)";

		
		try (Connection conexion = DriverManager.getConnection(url, user, pwd);
				Statement sentencia = conexion.createStatement();
				ResultSet rs = sentencia.executeQuery(query); //Este es para recuperar
					) {
			while(rs.next()) {
				System.out.println("#################");
				String nombre = rs.getString("nombre");
				System.out.println(nombre);
				String apellido = rs.getString("apellidos");
				System.out.println(apellido);
				int edad = rs.getInt("edad");
				System.out.println(edad);
				System.out.println("#################");
			}
			//	sentencia.executeUpdate(sql);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}

}
