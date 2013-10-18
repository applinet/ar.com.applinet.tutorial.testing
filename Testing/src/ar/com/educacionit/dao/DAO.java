package ar.com.educacionit.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

	private Connection conn;
	
	public void insertar() throws SQLException{
		
		String laInsercion = dameStringInsercion();
		
		// Informa la insercion a realizar
		System.out.println(">>SQL: " + laInsercion);

		// Ejecuta la insercion
		Statement stmtInsercion = conn.createStatement();
		stmtInsercion.execute(laInsercion);

		// Cierra el Statement
		stmtInsercion.close();

	}

	protected abstract String dameStringInsercion();

}
