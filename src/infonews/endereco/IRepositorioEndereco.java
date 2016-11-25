package infonews.endereco;

import java.util.ArrayList;


public interface IRepositorioEndereco {
	
	public void cadastrar (Endereco endereco);
	public void atualizar (Endereco endereco);
	public Endereco procurar (int id);
	public boolean remover (int id);
	public boolean existe (int id);
	public ArrayList<Endereco> listar();
	
	

}
