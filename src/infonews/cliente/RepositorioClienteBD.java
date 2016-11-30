package infonews.cliente;

import java.sql.Connection;




import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import infonews.contato.Contato;
import infonews.contato.RepositorioContato;
import infonews.conexaoBD.BancoConect;
import infonews.endereco.Endereco;
import infonews.endereco.RepositorioEnderecoBD;
import infonews.fachada.Fachada;
import infonews.cliente.Cliente;
import infonews.conexaoBD.BancoConect;

	public class RepositorioClienteBD implements IRepositorioCliente{
		
		public void cadastrar(Cliente cliente) {

		String sql = "insert into cliente (nome, cpf, tipo, contato_id, endereco_idEndereco) values (?,?,?,?,?)";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement pStmnt = con.prepareStatement(sql);
			
			pStmnt.setString(1, cliente.getNome());
			pStmnt.setString(2, cliente.getCpf());
			pStmnt.setString(3, cliente.getTipo());
			pStmnt.setInt(4, cliente.getContato().getIdContato());
			pStmnt.setInt(5, cliente.getEndereco().getIdEndereco());
			
			
			pStmnt.execute();
			
			pStmnt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

@Override
public Cliente procurar(int id) {
	String sql = "select * from cliente where idCliente = ?";
	
	try {
		Connection con = BancoConect.getConnection();
		
		PreparedStatement pStmnt = con.prepareStatement(sql);
		pStmnt.setInt(1, id);
		ResultSet resultSet = pStmnt.executeQuery();
		
		if(resultSet.next()){
			Fachada fachada = new Fachada();
			Endereco endereco = fachada.procurarEndereco(resultSet.getInt(6));
			Contato contato = fachada.procurarContato(resultSet.getInt(5));
			return new Cliente(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), contato, endereco);
		}
		
		pStmnt.close();
		resultSet.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
}

@Override
public void atualizar(Cliente cliente) {
	if(existe(cliente.getCpf())){
		String sql = "update cliente set idCliente = ?, nome = ?, cpf = ?, tipo = ?, contato_id = ?, endereco_idEndereco where idCliente = ?";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement pStmnt = con.prepareStatement(sql);
			pStmnt.setInt(1, cliente.getIdCliente());
			pStmnt.setString(2, cliente.getNome());
			pStmnt.setString(3, cliente.getCpf());
			pStmnt.setString(4, cliente.getTipo());
			pStmnt.setInt(5, cliente.getContato().getIdContato());			
			pStmnt.setInt(6, cliente.getEndereco().getIdEndereco());
			
			pStmnt.executeUpdate();
			
			pStmnt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

@Override
public boolean remover(int id) {
	
	Cliente cliente = procurar(id);
	
	String sql = "delete from cliente where idCliente = ?";
	String sql2 = "delete from contato where idContato = ?";
	String sql3 = "delete from endereco where idEndereco = ?";
			
	try {
		Connection con = BancoConect.getConnection();
		
		PreparedStatement pStmnt = con.prepareStatement(sql);
		pStmnt.setInt(1, id);
		pStmnt.executeUpdate();
		pStmnt.close();
		
		PreparedStatement pStmnt2 = con.prepareStatement(sql2);
		pStmnt2.setInt(1, id);
		pStmnt2.executeUpdate();
		pStmnt2.close();
		
		PreparedStatement pStmnt3 = con.prepareStatement(sql3);
		pStmnt3.setInt(1, cliente.getEndereco().getIdEndereco());
		pStmnt3.executeUpdate();
		pStmnt3.close();
		
		con.close();
		
		return true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
}

@Override
public boolean existe(String cpf) {
	String sql = "select * from cliente";
	
	try {
		Connection con = BancoConect.getConnection();
		
		PreparedStatement pStmnt = con.prepareStatement(sql);
		
		ResultSet resultSet = pStmnt.executeQuery();
		
		while(resultSet.next()){
			if(resultSet.getString(3).equals(cpf));
			return true;
		}
		
		pStmnt.close();
		resultSet.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return false;
}

@Override
public ArrayList<Cliente> listar() {
	ArrayList<Cliente> lista = new ArrayList<>();
	
	String sql = "select * from cliente";
	
	try {
		Connection con = BancoConect.getConnection();
		
		PreparedStatement pStmnt = con.prepareStatement(sql);
		
		ResultSet resultSet = pStmnt.executeQuery();
		
		while(resultSet.next()){
			Cliente cliente = new Cliente();
			
			cliente.setIdCliente(resultSet.getInt(1));
			cliente.setNome(resultSet.getString(2));
			cliente.setCpf(resultSet.getString(3));
			cliente.setTipo(resultSet.getString(4));
			cliente.setContato(new RepositorioContato().procurar(resultSet.getInt(5)));
			cliente.setEndereco(new RepositorioEnderecoBD().procurar(resultSet.getInt(6)));
			
			lista.add(cliente);
		}
		
		pStmnt.close();
		resultSet.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return lista;
}
	
	}
