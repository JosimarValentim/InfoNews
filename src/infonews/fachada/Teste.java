package infonews.fachada;

import java.util.ArrayList;


import infonews.cliente.Cliente;
import infonews.contato.Contato;
import infonews.endereco.Endereco;

public class Teste {
	public static void main(String[] args){
		
		Fachada f = Fachada.getInstance();
		
		Endereco endereco = new Endereco(1, "26", "jardim brasil", "olinda", "53354134", "cristovao");
		
		f.cadastrarEndereco(endereco);
		
		ArrayList<Endereco> listaEndereco = f.listarEndereco();
		
		int indice = 0;
		
		for(int i=0;i<listaEndereco.size();i++){
			
			if(listaEndereco.get(i).getRua().equals(endereco.getRua())){
				
				if(listaEndereco.get(i).getNumero().equalsIgnoreCase(endereco.getNumero())){
					indice = listaEndereco.get(i).getIdEndereco();	
				}
				
			}
		}
		
	Contato contato = new Contato(1, "49893464", "fixo");
		
		f.cadastrarContato(contato);
		
		ArrayList<Contato> listaContato = f.listarContato();
		
		int indiceContato = 0;
		
		for(int i=0;i<listaContato.size();i++){
			
			if(listaContato.get(i).getTelefone().equals(contato.getTelefone())){
				
				if(listaContato.get(i).getTipo().equalsIgnoreCase(contato.getTipo())){
					indiceContato = listaContato.get(i).getIdContato();	
				}
				
			}
		}
		
		Cliente cli = new Cliente(1, "Mazo", "1234567890", "fixo", f.procurarContato(indiceContato), f.procurarEndereco(indice));
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
