package infonews.endereco;

import java.util.ArrayList;

public class ControladorEndereco {
	
private RepositorioEnderecoBD repositorioEndereco;
	
	private static ControladorEndereco controladorEndereco;
	
	public ControladorEndereco() {
		repositorioEndereco = new RepositorioEnderecoBD();
	}
	
	public void cadastrarEndereco (Endereco endereco){
		repositorioEndereco.cadastrar(endereco);
	}
	
	public void atualizar (Endereco endereco){
		repositorioEndereco.atualizar(endereco);
	}
	
	public boolean removerEndereco (int id){
		if(procurarEndereco(id) != null){
			return repositorioEndereco.remover(id);		
		}else{
			return false;
		}
	}
	
	public Endereco procurarEndereco (int id){
		return repositorioEndereco.procurar(id);
	}
	
	public ArrayList<Endereco> listarEndereco(){
		return repositorioEndereco.listar();
	}

}
