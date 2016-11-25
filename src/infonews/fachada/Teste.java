package infonews.fachada;

import java.util.ArrayList;


import infonews.cliente.*;

public class Teste {
	public static void main(String[] args){
		
		Fachada f = Fachada.getInstance();
		
		Cliente cli = new Cliente(1, "mayos", "11356043580", "celular", 1, 1);
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
