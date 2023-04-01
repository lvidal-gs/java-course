package fundamentos;

public class Strings {
	public static void main(String[] args) {
		System.out.println("Salve, salve família!".charAt(5)); //atente-se ao retorno dos métodos
		
		String s = "Buenas tardes"; 
		System.out.println(s.concat("!")
				.replace("B", "¡B"));
		
		System.out.println(s.startsWith("B"));
		System.out.println(s.startsWith("b"));
		System.out.println(s.toLowerCase().startsWith("b"));
		
		System.out.println(s.length() + 10 );
		System.out.println(s.length() + 10 + " teste");
		
		System.out.println(s.equals("Buenas tardes"));
		System.out.println(s.equals("Buenas tardes!"));
		System.out.println(s.equalsIgnoreCase("buEnAs tARdes"));
		
		var nome = "Lucas";
		var sobrenome = "Vidal";
		var idade = 22;
		var salario = 10.0F;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome); 
		System.out.println("\n-------------\n");
		
		//Pode ser substituido por algo mais legivel/formatado:
		System.out.printf("Nome: %s %s\nIdade: %d\nGanha: R$%.2f.", nome, sobrenome, idade, salario);
		
		//String.format
		String frase = String.format("Nome: %s %s\nIdade: %d\nGanha: R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println("\n-------------\n");
		System.out.println(frase);
		
	}
}