package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BancoConect {
	
	public static void main(String[] args) throws SQLException{
	
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "");
		System.out.println("Conectado");
	
		conn.close();
	

		
	}
}

