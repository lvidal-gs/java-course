package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Hello");
		System.out.println(" World!!");
		
		System.out.printf("Teste %d relacionado a pessoa %s de %d anos.%n", 18, "Jobsu", 38);
		System.out.printf("Jobsu tem %.3fkgs%n", 78.28912);
		
		Scanner entry = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String name = entry.nextLine();
		
		System.out.println("E idade?");
		String age = entry.nextLine();
		
		System.out.println("\nOlá " + name + "! " + age + " anos de pura coisa ruim.");
		
		entry.close();		
	}
}
