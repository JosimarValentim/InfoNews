package infonews.cliente;

import infonews.contato.Contato;

public class Cliente {
	
	private double cpf;
	private int codigo;
	private String nome;
	private Contato contato;

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

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", contato=" + contato + "]";
	}	

}
