package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		//Tudo em java é objeto, menos os tipo primitivos.
		//Os wrappers são os tipos primitivos com métodos e atributos, ou seja
		//a versão objeto deles.
		
		//Classe nome = valor, padrão Java de ser! Não esqueça disso.
		//O que difere o Wrapper dos tipos primitivos é a Capital letter
		
		// Byte -> Wrapper (Objeto)
		// byte -> Primitivo
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 100000;		
		Long l = 100000000L;
		
		Float f = 10.00F;
		Double d = 10.0000000;
		
		Boolean bool = Boolean.parseBoolean("TrUe");
		
		Character c = '%';
		
		//----------------
		
		Integer string = Integer.parseInt("6232232");
		
		System.out.println(b.hashCode());
		System.out.println(string);
		System.out.println(bool);
	}
}
