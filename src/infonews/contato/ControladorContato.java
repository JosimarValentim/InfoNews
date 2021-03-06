package infonews.contato;

import java.util.ArrayList;

public class ControladorContato {
	
	private IRepositorioContato repositorioContato;
	
	private static ControladorContato controladorContato;
	
	public ControladorContato() {
		repositorioContato = new RepositorioContato();
	}
	
	public void cadastrarContato(Contato contato){
		repositorioContato.cadastrar(contato);
	}
	
	public void atualizarContato(Contato contato){
		repositorioContato.atualizar(contato);
	}
	
	public Contato procurarContato (int id){
		return repositorioContato.procurar(id);
	}
	
	
	public boolean removerContato (int id){
		if(procurarContato(id) != null){
			return repositorioContato.remover(id);
		}else{
			return false;
		}
	}

	public ArrayList<Contato> listarContato() {
		return repositorioContato.listar();
	}
}
