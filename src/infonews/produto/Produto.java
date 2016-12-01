package infonews.produto;

public class Produto {
	
	private int Codigo;
	private String Nome;
	private String Entrega;
	private int Valor_Venda;
	private int Valor_Fornecedor;
	private String Fornecedor;
	
	
	@Override
	public String toString() {
		return "Produto [Codigo=" + Codigo + ", Nome=" + Nome + ", Entrega=" + Entrega + ", Valor_Venda=" + Valor_Venda
				+ ", Valor_Fornecedor=" + Valor_Fornecedor + ", Fornecedor=" + Fornecedor + "]";
	}



	

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEntrega() {
		return Entrega;
	}

	public void setEntrega(String entrega) {
		Entrega = entrega;
	}

	public int getValor_Venda() {
		return Valor_Venda;
	}

	public void setValor_Venda(int valor_Venda) {
		Valor_Venda = valor_Venda;
	}

	public int getValor_Fornecedor() {
		return Valor_Fornecedor;
	}

	public void setValor_Fornecedor(int valor_Fornecedor) {
		Valor_Fornecedor = valor_Fornecedor;
	}

	public String getFornecedor() {
		return Fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}


	public int getCodigo() {
		return Codigo;
	}


	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public Produto(int codigo, String nome, String entrega, int valor_Venda, int valor_Fornecedor, String fornecedor) {
		
		Codigo = codigo;
		Nome = nome;
		Entrega = entrega;
		Valor_Venda = valor_Venda;
		Valor_Fornecedor = valor_Fornecedor;
		Fornecedor = fornecedor;
	}

	
	
}
