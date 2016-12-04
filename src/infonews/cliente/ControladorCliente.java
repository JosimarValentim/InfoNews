package infonews.cliente;

import java.util.ArrayList;

import infonews.endereco.ControladorEndereco;

public class ControladorCliente {
	
	private IRepositorioCliente repositorioCliente;
	private ControladorEndereco controladorEndereco;

	public ControladorCliente() {
		this.repositorioCliente = new RepositorioClienteBD();
		this.controladorEndereco = new ControladorEndereco();
		
	}

	public void cadastrar(Cliente cliente){
		this.repositorioCliente.cadastrar(cliente);
		
	}

	public void atualizar(Cliente cliente) {
		this.repositorioCliente.atualizar(cliente);
		
	}

	public void remover(int id) {
		this.repositorioCliente.remover(id);
	}

	public Cliente procurar(int id) {
		Cliente cliente = null;
		cliente = this.repositorioCliente.procurar(id);
		return cliente;
	}

	public ArrayList<Cliente> listar() {
		ArrayList<Cliente> clientes = null;
		clientes = this.repositorioCliente.listar();

		return clientes;
	}

}
