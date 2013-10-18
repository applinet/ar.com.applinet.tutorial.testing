package ar.com.educacionit.javastd.entidades;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import ar.com.educacionit.dao.DAO;

public class Club extends DAO {

	private int id;
	private String nombre;
	private Date fechaFundacion;
	private int cantCopas;

	public Club(String nombre, Date fechaFundacion, int cantCopas) {
		super();
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.cantCopas = cantCopas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(Date fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public int getCantCopas() {
		return cantCopas;
	}

	public void setCantCopas(int cantCopas) {
		this.cantCopas = cantCopas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public void insertar(Connection conn) throws SQLException {
//		// Arma la sentencia de inserción
//		String laInsercion = "INSERT INTO clubes (id, nombre, fechaFundacion, cantCopas) "
//				+ "VALUES ('"
//				+ null
//				+ ", '"
//				+ nombre
//				+ "', '"
//				+ PruebaUsoClaseDate.formateoEspanol.format(fechaFundacion)
//				+ "', "
//				+ cantCopas
//				+ ")";
//
//		// Informa la insercion a realizar
//		System.out.println(">>SQL: " + laInsercion);
//
//		// Ejecuta la insercion
//		Statement stmtInsercion = conn.createStatement();
//		stmtInsercion.execute(laInsercion);
//
//		// Cierra el Statement
//		stmtInsercion.close();
//
//	}

	public void actualizar(Connection conn) {

	}

	public void eliminar(Connection conn) {

	}

	@Override
	protected String dameStringInsercion() {
		// Arma la sentencia de inserción
		String laInsercion = "INSERT INTO clubes (id, nombre, fechaFundacion, cantCopas) "
				+ "VALUES ('"
				+ null
				+ ", '"
				+ nombre
				+ "', '"
				+ PruebaUsoClaseDate.formateoEspanol.format(fechaFundacion)
				+ "', "
				+ cantCopas
				+ ")";
		
		return laInsercion;
	}

}
