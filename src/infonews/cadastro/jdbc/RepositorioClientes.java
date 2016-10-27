package infonews.cadastro.jdbc;

import java.sql.ResultSet;

import infonews.cliente.*;;

public interface RepositorioClientes {

		public void inserir(Cliente c) ;
		public ResultSet listar();
		public Cliente procurar(int cpf);
		public void remover(int cpf);
	}


