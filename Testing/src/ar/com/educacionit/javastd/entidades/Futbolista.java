package ar.com.educacionit.javastd.entidades;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import ar.com.educacionit.dao.DAO;

public class Futbolista extends DAO {

	private int id;
	private String nombre;
	private String posicion;
	private double sueldo;
	private Club club;

	public Futbolista(String nombre, String posicion, double sueldo, Club club) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.sueldo = sueldo;
		this.club = club;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void insertar(Connection conn) throws SQLException{
		// Arma la sentencia de inserción
		String laInsercion = "INSERT INTO futbolistas (id, nombre, posicion, sueldo, clubId) "
				+ "VALUES ('"
				+ null
				+ ", '"
				+ nombre
				+ "', '"
				+ posicion
				+ "', "
				+ sueldo
				+ "', "
				+ club.getId()
				+ ")";

		// Informa la insercion a realizar
		System.out.println(">>SQL: " + laInsercion);

		// Ejecuta la insercion
		Statement stmtInsercion = conn.createStatement();
		stmtInsercion.execute(laInsercion);

		// Cierra el Statement
		stmtInsercion.close();

	}

	public void actualizar(Connection conn){
		
	}
	
	public void eliminar(Connection conn){
		
	}

	@Override
	protected String dameStringInsercion() {
		// TODO Auto-generated method stub
		return null;
	}

}
