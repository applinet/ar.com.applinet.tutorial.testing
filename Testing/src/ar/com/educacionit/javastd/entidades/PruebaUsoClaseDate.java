package ar.com.educacionit.javastd.entidades;

import java.text.SimpleDateFormat;

public class PruebaUsoClaseDate {

	public static final SimpleDateFormat formateoEspanol = new SimpleDateFormat("dd/MM/yyyy"); 
	public static final SimpleDateFormat formateoYankee = new SimpleDateFormat("MM/dd/yyyy"); 
	
	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		System.out.println("ES-AR " + formateoEspanol.format(date));
		System.out.println("EN-US " + formateoYankee.format(date));
	}

}
