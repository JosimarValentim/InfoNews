package infonews.contato;

import java.util.ArrayList;

public interface IRepositorioContato {
	
	public void cadastrar (Contato contato);
	public void atualizar (Contato contato);
	public Contato procurar (int idContato);
	public boolean remover (int idContato);
	public boolean existe (int idContato);
	public ArrayList<Contato> listar();

}
