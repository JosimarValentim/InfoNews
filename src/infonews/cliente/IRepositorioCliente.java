package infonews.cliente;

import java.util.ArrayList;

public interface IRepositorioCliente {
	
	public void cadastrar(Cliente cliente);

	public void atualizar(Cliente cliente);

	public boolean remover(int id);

	public Cliente procurar(int id);

	public boolean existe(String cpf);

	public ArrayList<Cliente> listar();

}
