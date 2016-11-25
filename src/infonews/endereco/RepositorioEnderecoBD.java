package infonews.endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import infonews.conexaoBD.BancoConect;
import infonews.endereco.Endereco;

public class RepositorioEnderecoBD implements IRepositorioEndereco {
	
	public RepositorioEnderecoBD() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void cadastrar(Endereco endereco) {
		
		
		String sql = "insert into endereco (idEndereco, numero, bairro, cidade, cep, rua) values (?,?,?,?,?,?)";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement pStmnt = con.prepareStatement(sql);
			pStmnt.setInt(1, endereco.getIdEndereco());
			pStmnt.setInt(2, endereco.getNumero());
			pStmnt.setString(3, endereco.getBairro());
			pStmnt.setString(4, endereco.getCidade());
			pStmnt.setInt(4, endereco.getCep()); 	
			pStmnt.setString(4, endereco.getRua());
			
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
	public void atualizar(Endereco endereco) {
		String sql = "update endereco set numero = ?, bairro = ?, cidade = ?, cep = ?, rua = ? where idEndereco = ?";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement pStmnt = con.prepareStatement(sql);
			pStmnt.setInt(1, endereco.getIdEndereco());
			pStmnt.setInt(2, endereco.getNumero());
			pStmnt.setString(3, endereco.getBairro());
			pStmnt.setString(4, endereco.getCidade());
			pStmnt.setInt(4, endereco.getCep()); 	
			pStmnt.setString(4, endereco.getRua());
			
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

	@Override
	public Endereco procurar(int id) {
		String sql = "select * from endereco where idEndereco = ?";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet resultSet = ps.executeQuery();
			
			if(resultSet.next()){
				return new Endereco(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5), resultSet.getString(6));
			}
			
			resultSet.close();
			ps.close();
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
	public boolean remover(int id) {
		String sql = "delete from endereco where idEndereco = ?";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ps.executeUpdate();
			
			ps.close();
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
	public boolean existe(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Endereco> listar() {
		ArrayList<Endereco> lista = new ArrayList<>();
		
		String sql = "select * from endereco";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Endereco endereco = new Endereco(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				
				lista.add(endereco);
			}
			
			ps.close();
			con.close();
			rs.close();
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
