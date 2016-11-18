package infonews.cadastro.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import infonews.cliente.Cliente;
import infonews.fachada.Fachada;

public class TesteCadastro {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(3);
		cliente.setNome("Tarcicio");
		cliente.setCpf(1234567891);
		cliente.setContato_id(1);
		cliente.setEndereco_idEndereco(1);
		

		Fachada.obterInstancia().cadastrar(cliente);
		ResultSet rs = Fachada.obterInstancia().listar();
		
		ResultSetMetaData mdata;
		try {
			mdata = rs.getMetaData();
			int colCount = mdata.getColumnCount();
			String[] colNames = new String[colCount];
			for (int i = 1; i <= colCount; i++) {
				colNames[i - 1] = mdata.getColumnName(i);
			}
			rs.beforeFirst();
			while (rs.next()) {
				String[] rowData = new String[colCount];
				for (int i = 1; i <= colCount; i++) {
					rowData[i - 1] = rs.getString(i);
					System.out.println(rowData[i - 1]);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
