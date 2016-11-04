package infonews.conexaoBD;

import java.sql.*;

public class BancoConect {
	
	static String status = "";
	
	public static Connection getConnection(){
		Connection conn = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String url = "jdbc:mysql://localhost/mydb?user=root&password=";
			conn = DriverManager.getConnection(url);
			
			status = "Conexao aberta";
		}
		catch(SQLException e){
			status = e.getMessage();
		}catch(ClassNotFoundException e){
			status = e.getMessage();
		}catch(Exception e){
			status = e.getMessage();
		}
		return conn;
	}
	
}