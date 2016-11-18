package infonews.cliente;

import java.sql.ResultSet; 

import infonews.cliente.Cliente;

public class CadastroClientes {
	
	private IRepositorioCliente clientes;

	public CadastroClientes(IRepositorioCliente rep) {

		this.clientes = rep;
	}

	public void cadastrar(Cliente c) {
		clientes.inserir(c);
	}
	
	public Cliente procurar(int cpf) {
		return clientes.procurar(cpf);
	}
	
	public void remover(int cpf) {
		clientes.remover(cpf);
	}
	
	public ResultSet listar() {
		return clientes.listar();
	}

}
