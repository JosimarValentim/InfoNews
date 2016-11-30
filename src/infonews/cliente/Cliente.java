package infonews.cliente;

import infonews.contato.Contato;
import infonews.endereco.Endereco;

public class Cliente {
	
	private int idCliente;
	private String cpf;
	private String nome;
	private String tipo;
	private Contato contato;
	private Endereco endereco;
	
	public Cliente(int idCliente, String nome, String cpf, String tipo, Contato contato, Endereco endereco) {

		this.idCliente = idCliente;
		this.cpf = cpf;
		this.nome = nome;
		this.tipo = tipo;
		this.contato = contato;
		this.endereco = endereco;
	}

	public Cliente(){
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cpf=" + cpf + ", nome=" + nome + ", tipo=" + tipo
				+ ", contato=" + contato + ", endereco=" + endereco + "]";
	}

}
