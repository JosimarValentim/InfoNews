package infonews.endereco;

public class Endereco {
	
	private int idEndereco;
	private String numero;
	private String bairro;
	private String cidade;
	private String cep;
	private String rua;
	
	
	public Endereco(int idEndereco, String string, String bairro, String cidade, String string2, String rua) {
		
		this.idEndereco = idEndereco;
		this.numero = string;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = string2;
		this.rua = rua;
	}


	public int getIdEndereco() {
		return idEndereco;
	}


	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
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


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
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
