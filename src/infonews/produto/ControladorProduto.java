package infonews.produto;

import java.util.ArrayList;

import infonews.produto.Produto;
import infonews.produto.IRepositorioProduto;
import infonews.produto.RepositorioProdutoBD;


public class ControladorProduto {
	
	private RepositorioProdutoBD repositorioProduto;
	private ControladorProduto controladorProduto;

	public ControladorProduto() {
		this.repositorioProduto = new RepositorioProdutoBD();
		this.controladorProduto = new ControladorProduto();
		
	}

	public void cadastrar(Produto produto){

		if (produto == null)
			throw new IllegalArgumentException("Produto Invalido.");

		this.repositorioProduto.cadastrar(produto);
		
	}

	public void atualizar(Produto produto) {
		this.repositorioProduto.atualizar(produto);
		
	}

	public void remover(int codigo) {
		this.repositorioProduto.remover(codigo);
	}

	public Produto procurar(int codigo) {
		Produto produto = null;
		produto = this.repositorioProduto.procurar(codigo);
		return produto;
	}

	public ArrayList<Produto> listar() {
		ArrayList<Produto> produto = null;
		produto = this.repositorioProduto.listar();

		return produto;
	}

}
