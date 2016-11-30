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
	
	public boolean removerEndereco (int idEndereco){
		if(procurarEndereco(idEndereco) != null){
			return repositorioEndereco.remover(idEndereco);		
		}else{
			return false;
		}
	}
	
	public Endereco procurarEndereco (int idEndereco){
		return repositorioEndereco.procurar(idEndereco);
	}
	
	public ArrayList<Endereco> listarEndereco(){
		return repositorioEndereco.listarEndereco();
	}

}
