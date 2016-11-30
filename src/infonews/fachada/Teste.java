package infonews.fachada;

import java.util.ArrayList;



import infonews.cliente.Cliente;
import infonews.contato.Contato;
import infonews.endereco.Endereco;

public class Teste {
	public static void main(String[] args){
		
		Fachada f = Fachada.getInstance();
		
		Contato contato = new Contato(1, "987569877", "celular");
		Endereco endereco = new Endereco(1, "435", "bultrins", "olinda", "53574200", "belmonte");
		Cliente cli = new Cliente(1, "Mazo", "1234567890", "celular", contato, endereco);
		f.cadastraCliente(cli);
		
		
		ArrayList<Cliente> listaCliente = f.listaCliente();
		
		int indiceCliente = 0;
		
		for(int i=0; i<listaCliente.size();i++){
			if(listaCliente.get(i).getCpf().equalsIgnoreCase(cli.getCpf())){
				indiceCliente = listaCliente.get(i).getIdCliente();
			}
		}
		
		System.out.println(indiceCliente);
	}

}
