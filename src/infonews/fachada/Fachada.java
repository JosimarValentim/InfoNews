package infonews.fachada;

import java.sql.ResultSet;

import infonews.cliente.CadastroClientes;
import infonews.cliente.Cliente;
import infonews.endereco.CadastrarEndereco;


public class Fachada {
	private static Fachada instancia;
	private CadastroClientes cliente;
	private CadastrarEndereco endereco;
	
	
	
	
	private Fachada() {
		
		this.cliente = new Cliente();

	}
}