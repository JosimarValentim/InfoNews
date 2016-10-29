package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BancoConect {
	
	public static void main(String[] args) throws SQLException{
	
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "");
		
		String sql ="select * from cliente";
        //String sql ="select * from cliente where cliente_id = ?";
        // Criar o PreparedStatement, objeto para executar a query
        PreparedStatement preStatement = conn.prepareStatement(sql);
        
        //preStatement.setInt(1, 2);
        // Executando o select
        ResultSet resultSet = preStatement.executeQuery();
        
        /*
         * Exemplo de Select
         */
        
        System.out.println("Imprimindo Dados do Banco");
        System.out.println("ID\tID\tNome\t\tCPF");
        // Verifica se retornou dados na consulta
        while(resultSet.next()){
        	// Pegando as colunas do registro
        	System.out.print(resultSet.getString(1) 	+ "\t");
        	System.out.print(resultSet.getString("cliente_id") 	+ "\t");
        	System.out.print(resultSet.getString("nome") 	+ "\t");
        	System.out.print(resultSet.getString("cpf")	+ "\t");
        	System.out.println();
        }
        // Fechando a Conexão
        preStatement.close();
        resultSet.close();
        conn.close();
		
	}
}

