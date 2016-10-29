package infonews.cliente;

public class Contato {
	
	private Integer id;
	private String telefone;
	private String tipo;
	
	public Contato(Integer id, String telefone, String tipo) {
	
		this.id = id;
		this.telefone = telefone;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
