package infonews.cliente;

import infonews.endereco.Endereco;

public class Cliente {
	
	private int idCliente;
	private String cpf;
	private String nome;
	private String tipo;
	private Endereco endereco;

	public Cliente(int id, String nome, String cpf, String tipo, Endereco endereco) {
		
		this.cpf = cpf;
		this.idCliente = id;
		this.nome = nome;
		this.tipo = tipo;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", idCliente=" + idCliente + ", nome=" + nome + ",tipo=" + tipo + " endereco=" + endereco + "]";
	}

}
