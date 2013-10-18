package ar.com.educacionit.programa;

import java.sql.SQLException;
import java.util.Date;

import ar.com.educacionit.javastd.entidades.Club;
import ar.com.educacionit.javastd.entidades.Futbolista;

public class TestDAOs {

	public static void main(String[] args) {
		Club boca = new Club("Boca Jrs", new Date(), 30);
		Futbolista jrr = new Futbolista("Juan Román Riquelme", "Enganche", 32767, boca);
		
		try {
			boca.insertar();
			jrr.insertar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
