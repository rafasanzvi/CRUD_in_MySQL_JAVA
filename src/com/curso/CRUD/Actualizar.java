package com.curso.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Actualizar {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/bdcurso";

		String user = "root";
		String pwd = "root";
		
		// String query = "UPDATE `personas` SET `nombre` = ?, `apellidos` = ?, `edad` = ?";
		String query = "update personas set nombre = 'Manolito' where nombre = 'Rafael';";
		
	
			
			try (Connection conexion = DriverManager.getConnection(url, user, pwd);
					Statement sentencia = conexion.createStatement();
					){
				if(sentencia.executeUpdate(query) > 0) {
					System.out.println("The name have been updated");
				}
				
			} catch (SQLException e) {
				

				e.printStackTrace();
			}
			
		

	}

}
