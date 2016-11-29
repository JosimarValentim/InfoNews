package infonews.fachada;

import java.util.ArrayList;


import infonews.cliente.Cliente;
import infonews.cliente.ControladorCliente;
import infonews.contato.Contato;
import infonews.endereco.ControladorEndereco;
import infonews.endereco.Endereco;
import infonews.fornecedor.CadastrarFornecedor;

public class Fachada {

	private ControladorCliente controladorCliente;
	private ControladorEndereco controladorEndereco;
	private CadastrarFornecedor controladorFornecedor;
	private static Fachada fachada;
	
	
	public Fachada() {
		
		this.controladorCliente = new ControladorCliente();
		this.controladorEndereco = new ControladorEndereco();
		this.controladorFornecedor = new CadastrarFornecedor();

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
	
	//Endereço
	
	public Endereco procurarEndereco(int id){
		return this.controladorEndereco.procurarEndereco(id);
	}
	
	public void cadastrarEndereco (Endereco endereco){
		controladorEndereco.cadastrarEndereco(endereco);
	}
	
	public void atualizarEndereco (Endereco endereco){
		controladorEndereco.atualizar(endereco);
	}
	
	public boolean removerEndereco (Integer id){
		return controladorEndereco.removerEndereco(id);
	}
	
	public Endereco procurarEndereco (Integer id){
		return controladorEndereco.procurarEndereco(id);
	}
	
	public ArrayList<Endereco> listarEndereco(){
		return controladorEndereco.listarEndereco();
	}
	
}