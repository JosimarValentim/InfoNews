package infonews.produto;

import java.util.ArrayList;

public interface IRepositorioProduto {
	
	
	
		public void cadastrar (Produto produto);
		public void atualizar (Produto produto);
		public Produto procurar (int codigo);
		public boolean remover (int codigo);
		public boolean existe (int codigo);
		public ArrayList<Produto> listar();


}
