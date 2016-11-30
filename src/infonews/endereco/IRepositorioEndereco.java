package infonews.endereco;

import java.util.ArrayList;


public interface IRepositorioEndereco {
	
	public void cadastrar (Endereco endereco);
	public void atualizar (Endereco endereco);
	public Endereco procurar (int idEndereco);
	public boolean remover (int idEndereco);
	public boolean existe (int idEndereco);
	public ArrayList<Endereco> listarEndereco();
	
	

}
