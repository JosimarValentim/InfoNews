package infonews.cliente;

public class Cliente {
	
	private long cpf;
	private int idCliente;
	private String nome;
	private int contato_id;
	private int endereco_idEndereco;

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

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getContato_id() {
		return contato_id;
	}

	public void setContato_id(int contato_id) {
		this.contato_id = contato_id;
	}
	

	public int getEndereco_idEndereco() {
		return endereco_idEndereco;
	}

	public void setEndereco_idEndereco(int endereco_idEndereco) {
		this.endereco_idEndereco = endereco_idEndereco;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", idCliente=" + idCliente + ", nome=" + nome + ", contato_id=" + contato_id
				+ ", endereco_idEndereco=" + endereco_idEndereco + "]";
	}

}
