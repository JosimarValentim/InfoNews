package infonews.conexaoBD;

public class Inicio {
	
	public static void main(String[] args){
		BancoConect.getConnection();
		System.out.println(BancoConect.status);
	}

}
