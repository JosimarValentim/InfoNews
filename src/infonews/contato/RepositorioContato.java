package infonews.contato;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import infonews.conexaoBD.BancoConect;

public class RepositorioContato implements IRepositorioContato {
	
	public RepositorioContato() {
		// TODO Auto-generated constructor stub
	}
	
	public void cadastrar(Contato contato) {
		String sql = "insert into contato (idContato, telefone, tipo) values (?,?,?)";
		
		try {
			
			Connection con = BancoConect.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, contato.getIdContato());
			ps.setString(2, contato.getTelefone());
			ps.setString(3, contato.getTipo());
			
			ps.execute();
			ps.close();
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
	public void atualizar(Contato contato) {
		String sql = "update contato set idContato = ?, telefone = ?, tipo = ? where idContato = ?";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, contato.getIdContato());
			ps.setString(2, contato.getTelefone());
			ps.setString(3, contato.getTipo());
			
			ps.executeUpdate();
			ps.close();
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
	public Contato procurar(int idContato) {
		String sql = "select * from contato where idContato = ?";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idContato);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				return new Contato(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			
			ps.close();
			rs.close();
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
	public boolean remover(int idContato) {
		String sql = "delete from contato where idContato = ?";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idContato);
			
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
	public boolean existe(int idContato) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Contato> listar() {
		ArrayList<Contato> listar = new ArrayList<>();
		
		String sql = "select * from contato";
		
		try {
			Connection con = BancoConect.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Contato contato = new Contato(rs.getInt(1), rs.getString(2),rs.getString(3));
				
				listar.add(contato);
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
		
		
		return listar;
	}

}
