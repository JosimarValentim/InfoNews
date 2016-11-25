package infonews.endereco;

public class Endereco {
	
	private int idEndereco;
	private int cep;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	
	public Endereco(int idEndereco, int cep, String rua, String bairro, int numero, String cidade) {
		super();
		this.idEndereco = idEndereco;
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	public Endereco(int i, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
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
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + "cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade="
				+ cidade + "]";
	}
	
}
