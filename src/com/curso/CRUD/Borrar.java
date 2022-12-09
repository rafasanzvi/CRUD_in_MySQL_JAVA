package com.curso.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Borrar {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/bdcurso";

		String user = "root";
		String pwd = "root";
		
		String query = "delete from personas where nombre = 'moni' ";
		

		try (Connection conexion = DriverManager.getConnection(url, user, pwd);
				Statement sentencia = conexion.createStatement();
				){
			if(sentencia.executeUpdate(query) > 0) {
				System.out.println("The name have been delete");
			}
			
		} catch (SQLException e) {
			

			e.printStackTrace();
		}
	}}
