package infonews.fachada;

import java.util.ArrayList;


import infonews.cliente.Cliente;
import infonews.cliente.ControladorCliente;
import infonews.contato.Contato;
import infonews.contato.ControladorContato;
import infonews.endereco.ControladorEndereco;
import infonews.endereco.Endereco;
import infonews.fornecedor.CadastrarFornecedor;

public class Fachada {

	private ControladorCliente controladorCliente;
	private ControladorEndereco controladorEndereco;
	private CadastrarFornecedor controladorFornecedor;
	private ControladorContato controladorContato;
	private static Fachada fachada;
	
	
	public Fachada() {
		
		this.controladorCliente = new ControladorCliente();
		this.controladorEndereco = new ControladorEndereco();
		this.controladorFornecedor = new CadastrarFornecedor();
		this.controladorContato = new ControladorContato();

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

	
	//Endereço
		
	public void cadastrarEndereco (Endereco endereco){
		controladorEndereco.cadastrarEndereco(endereco);
	}
	
	public void atualizarEndereco (Endereco endereco){
		controladorEndereco.atualizar(endereco);
	}
	
	public boolean removerEndereco (int idEndereco){
		return controladorEndereco.removerEndereco(idEndereco);
	}
	
	public Endereco procurarEndereco (int idEndereco){
		return controladorEndereco.procurarEndereco(idEndereco);
	}
	
	public ArrayList<Endereco> listarEndereco(){
		return controladorEndereco.listarEndereco();
	}
	
	//Contato
	
	public void cadastrarContato (Contato contato){
		controladorContato.cadastrarContato(contato);
	}
	
	public void atualizarContato (Endereco endereco){
		controladorEndereco.atualizar(endereco);
	}
	
	public boolean removerContato (int idContato){
		return controladorContato.removerContato(idContato);
	}
	
	public Contato procurarContato (int idContato){
		return controladorContato.procurarContato(idContato);
	}
	
	public ArrayList<Contato> listarContato(){
		return controladorContato.listarContato();
	}
	
}