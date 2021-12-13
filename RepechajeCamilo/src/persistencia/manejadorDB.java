package persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class manejadorDB {

	public static void createUsuario(int ci, String nombre, String apellido) {
		DBConf dbconf = new DBConf();
		Connection con = dbconf.conectarMySQL();
		
		try {
			// INSERTANDO
			Statement stmt = con.createStatement();

			// HACIENDO QUERY
			String query2 = "INSERT INTO Usuarios(ci,nombre,apellido) "
					+ "VALUES ("+ci+",'"+nombre+"','"+apellido+"')";
			stmt.executeQuery(query2);
		}catch (SQLException e) {
			// Imprime en pantalla el trace rojo
			e.printStackTrace();
		}
	}

	public static void deleteUsuario(int ci) {
		// TODO Auto-generated method stub
		DBConf dbconf = new DBConf();
		Connection con = dbconf.conectarMySQL();
		
		try {
			// INSERTANDO
			Statement stmt = con.createStatement();

			// HACIENDO QUERY
			String query2 = "DELETE Usuarios "
					+ "where ("+ci+"= ci)";
			stmt.executeQuery(query2);
		}catch (SQLException e) {
			// Imprime en pantalla el trace rojo
			e.printStackTrace();
		}
	}

	public static void updateUsuario(int ci, String nombre, String apellido) {
		// TODO Auto-generated method stub
		DBConf dbconf = new DBConf();
		Connection con = dbconf.conectarMySQL();
		
		try {
			// INSERTANDO
			Statement stmt = con.createStatement();

			// HACIENDO QUERY
			String query2 = "UPDATE usuarios"
					+ "SET ci="+ci+", nombre="+nombre+", apellido="+apellido+""
							+ "WHERE ci="+ci;
			stmt.executeQuery(query2);
		}catch (SQLException e) {
			// Imprime en pantalla el trace rojo
			e.printStackTrace();
		}
	}
	}
