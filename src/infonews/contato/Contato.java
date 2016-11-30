package infonews.contato;

public class Contato {
	
	private int idContato;
	private String telefone;
	private String tipo;

	public Contato(int idContato, String telefone, String tipo) {
		
		this.idContato = idContato;
		this.telefone = telefone;
		this.tipo = tipo;
	}
	public Contato(){
		
	}

	public Integer getIdContato() {
		return idContato;
	}

	public void setIdContato(int idContato) {
		this.idContato = idContato;
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

	@Override
	public String toString() {
		return "Contato [idContato=" + idContato + ", telefone=" + telefone + ", tipo=" + tipo + "]";
	}
	
}
