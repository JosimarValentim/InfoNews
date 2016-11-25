package infonews.conexaoBD;

import java.sql.*;

public class BancoConect {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root","");
	}
	
	private BancoConect() {
		
	}
	
}