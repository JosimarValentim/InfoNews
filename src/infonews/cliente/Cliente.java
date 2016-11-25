package infonews.cliente;

import infonews.endereco.Endereco;

public class Cliente {
	
	private String cpf;
	private int idCliente;
	private String nome;
	private String tipo;
	private int contato_id;
	private Endereco endereco_idEndereco;

	public Cliente(int id, String nome, String cpf, String tipo, int contato_id, Endereco endereco_idEndereco) {
		
		this.cpf = cpf;
		this.idCliente = id;
		this.nome = nome;
		this.tipo = tipo;
		this.contato_id = contato_id;
		this.endereco_idEndereco = endereco_idEndereco;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public Cliente(int id, String nome2, String cpf2, String tipo2, int contato_id2, int i) {
		// TODO Auto-generated constructor stub
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

	public int getContato_id() {
		return contato_id;
	}

	public void setContato_id(int contato_id) {
		this.contato_id = contato_id;
	}
	

	public Endereco getEndereco_idEndereco() {
		return endereco_idEndereco;
	}

	public void setEndereco_idEndereco(Endereco endereco) {
		this.endereco_idEndereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", idCliente=" + idCliente + ", nome=" + nome + ",tipo=" + tipo + ", contato_id=" + contato_id
				+ ", endereco_idEndereco=" + endereco_idEndereco + "]";
	}

}
