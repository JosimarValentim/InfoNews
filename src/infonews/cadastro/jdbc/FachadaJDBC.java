package infonews.cadastro.jdbc;

import java.sql.ResultSet;

import infonews.cliente.Cliente;
import infonews.cadastro.jdbc.CadastroClientes;
import infonews.cadastro.jdbc.FachadaJDBC;
import infonews.cadastro.jdbc.RepositorioClientes;
import infonews.cadastro.jdbc.RepositorioClientesBD;

public class FachadaJDBC {
	
	private static FachadaJDBC instancia;
	private CadastroClientes clientes;

	private FachadaJDBC() {

		initCadastros();
	}

	private void initCadastros() {
		String nomeDriver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String pwd = "";

		RepositorioClientes rep = new RepositorioClientesBD(nomeDriver,
				url,user,pwd);
		clientes = new CadastroClientes(rep);
		//RepositorioClientes repClientes = new ArrayClientes();
		RepositorioClientes repClientes = new RepositorioClientesBD(nomeDriver,
				url,user,pwd);
		clientes = new CadastroClientes(repClientes);
	}

	public static FachadaJDBC obterInstancia() {

		if (instancia == null) {
			instancia = new FachadaJDBC();
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
