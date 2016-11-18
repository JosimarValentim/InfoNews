package infonews.cliente;

import java.sql.ResultSet;

public interface IRepositorioCliente {
	
	public void inserir(Cliente c) ;
	public ResultSet listar();
	public Cliente procurar(int cpf);
	public void remover(int cpf);

}
