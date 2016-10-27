package infonews.cliente;

public class Contato {
	
	private int id;
	private int telefone;
	private String tipo;
	
	public Contato(int id, int telefone, String tipo) {
	
		this.id = id;
		this.telefone = telefone;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "Contato [id=" + id + ", telefone=" + telefone + ", tipo=" + tipo + "]";
	}
	
}
