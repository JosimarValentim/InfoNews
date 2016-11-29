package infonews.endereco;

public class Endereco {
	
	private int idEndereco;
	private int numero;
	private String bairro;
	private String cidade;
	private int cep;
	private String rua;
	
	public Endereco(int idEndereco, int numero, String bairro, String cidade, int cep, String rua) {
	
		this.idEndereco = idEndereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.rua = rua;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", cep=" + cep + ", rua=" + rua + "]";
	}
	
		
}
