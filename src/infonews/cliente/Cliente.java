package infonews.cliente;

public class Cliente {
	
	private int codigo;
	private String nome;
	private double cpf;
	private String contato;
	
	public Cliente(int codigo, String nome, double cpf, String contato) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", contato=" + contato + "]";
	}
	

}
