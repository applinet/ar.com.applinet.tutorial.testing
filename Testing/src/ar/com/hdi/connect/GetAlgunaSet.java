package ar.com.hdi.connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAlgunaSet {

	public static void main(String[] args) {
		
		Connection connection   = null;

		if (args.length != 3) {
			System.out.println("ERROR: Debe pasar usuario, password y servidor");
			return;
		}

		String userid = args[0];
        String passwd = args[1];
		String server = args[2];
        String url = "jdbc:as400://" + server.trim() + ";naming=system";

        System.out.println("Conectando a " + server + " usuario " + userid);
        System.out.println("Buscando driver para " + url);
        
        try {
            DriverManager.registerDriver(
               new com.ibm.as400.access.AS400JDBCDriver());

            connection = DriverManager.getConnection(url, userid, passwd);
            Statement stmt = connection.createStatement ();
            
            String q = "SELECT T@COBL, T@COBD FROM DEMOCTA/SET225";
            
            ResultSet rs = stmt.executeQuery (q);
            int cont = 0;
            while (rs.next ()) {
            	cont ++;
            	String cobl = rs.getString(1);
            	String cobd = rs.getString(2);
                System.out.println (cont + ". " + cobl + " - " + cobd);
            }
        }

        catch (Exception e) {
            System.out.println ();
            System.out.println ("ERROR: " + e.getMessage());
        }

        finally {
            try {
                if (connection != null)
                    connection.close ();
            }
            catch (SQLException e) {
            }
        }

        System.exit (0);
	}

}
