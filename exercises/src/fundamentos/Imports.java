package fundamentos;

//Basicamente muitas coisas nao estao disponiveis 100% do tempo no java
//sendo necessário importa-las para conseguirem serem utilizadas.
//Imports ficam fora da classe

import java.util.Date;

public class Imports {	
	
	public static void main(String[] args) {
		String s = "Uoba, bão?";
		System.out.println(s);
		
		s = s.replace(", ", ", tudo ").toUpperCase();
		System.out.println(s);
		
		//Não é possivel fazer essas operações com ponto "." com os tipos primitivos
		
		
		Date data = new Date();
		System.out.println(data);
		
//		JButton botao = new JButton();
//		System.out.println(botao);
		
		
		
	}
}
