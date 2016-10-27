package infonews.cadastro.jdbc;

import java.sql.ResultSet;

import infonews.cliente.*;

public class CadastroClientes {
	
	private RepositorioClientes clientes;

	public CadastroClientes(RepositorioClientes rep) {

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
