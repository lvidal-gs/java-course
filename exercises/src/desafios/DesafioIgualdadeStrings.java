package desafios;

public class DesafioIgualdadeStrings {
	public static void main(String[] args) {
		String s = "Eu sou uma string";
		String s2 = new String("     Eu sou uma string    ");
		
		System.out.println(s == "Eu sou uma string");
		System.out.println("Eu sou uma string" == s2); // FALSE
		System.out.println(s == s2); //FALSE
		
		System.out.println(s.equals(s2.trim())); //Só analisa o conteudo, logo TRUE
		
	}
}
