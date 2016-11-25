package infonews.fachada;

import java.util.ArrayList;

import infonews.cliente.Cliente;
import infonews.cliente.ControladorCliente;
import infonews.contato.Contato;
import infonews.endereco.ControladorEndereco;
import infonews.fornecedor.CadastrarFornecedor;

public class Fachada {

	private ControladorCliente controladorCliente;
	private ControladorEndereco controladorEndereco;
	private CadastrarFornecedor controladorFornecedor;
	private static Fachada fachada;
	
	
	private Fachada() {
		
		this.controladorCliente = new ControladorCliente();

	}
	public static Fachada getInstance() {
		if (fachada == null) {
			fachada = new Fachada();
		}
		return fachada;
	}
	
	//Cliente
	public void cadastraCliente(Cliente cliente){
		this.controladorCliente.cadastrar(cliente);
	}
	public void atualizarCliente(Cliente cliente) {
		this.controladorCliente.atualizar(cliente);
	}

	public void removerCliente(int id) {
		this.controladorCliente.remover(id);
	}

	public Cliente procuraCliente(int id) {
		return this.controladorCliente.procurar(id);
	}

	public ArrayList<Cliente> listaCliente() {
		return this.controladorCliente.listar();
	}
	public void cadastrarContato(Contato contato) {
		// TODO Auto-generated method stub
		
	}
}