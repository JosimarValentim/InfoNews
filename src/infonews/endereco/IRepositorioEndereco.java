package infonews.endereco;

import java.sql.ResultSet;

public interface IRepositorioEndereco {
	
	public void inserir(Endereco c) ;
	public ResultSet listar();
	public Endereco procurar(int cpf);
	public void remover(int cpf);
	
	

}
