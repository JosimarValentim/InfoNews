package infonews.fachada;

import java.sql.ResultSet;

import infonews.cliente.*;


public class Fachada {
	private static Fachada instancia;
	private CadastroClientes clientes;

	private Fachada() {

		initCadastros();
	}

	private void initCadastros() {
		String nomeDriver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String pwd = "";

		IRepositorioCliente rep = new RepositorioClientesBD(nomeDriver,
				url,user,pwd);
		clientes = new CadastroClientes(rep);
		//RepositorioClientes repClientes = new ArrayClientes();
		IRepositorioCliente repClientes = new RepositorioClientesBD(nomeDriver,
				url,user,pwd);
		clientes = new CadastroClientes(repClientes);
	}

	public static Fachada obterInstancia() {

		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}

	public void cadastrar(Cliente c) {

		clientes.cadastrar(c);
	}

	public Cliente procura(int cpf) {
		return clientes.procurar(cpf);
	}

	public void remover(int cpf) {
		clientes.remover(cpf);
	}
	
	public ResultSet listar() {
		return clientes.listar();
	}


}
