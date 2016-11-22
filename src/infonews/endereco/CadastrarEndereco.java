package infonews.endereco;

import java.sql.ResultSet;

public class CadastrarEndereco {
	
	private IRepositorioEndereco endereco;

	public CadastrarEndereco(IRepositorioEndereco rep) {

		this.endereco = rep;
	}

	public void cadastrar(Endereco en) {
		endereco.inserir(en);
	}
	
	public Endereco procurar(int cpf) {
		return endereco.procurar(cpf);
	}
	
	public void remover(int cpf) {
		endereco.remover(cpf);
	}
	
	public ResultSet listar() {
		return endereco.listar();
	}

}
