package desafios;

import java.util.Scanner;

public class DesafioEC {
	public static void defWhile() {
		System.out.println("Calcule a média dos alunos: ");
		System.out.println("PARA SAIR DIGITE SAIR");
		
		String valor = "";
		int contador = 0;
		Scanner entry = new Scanner(System.in);
		double total = 0;
		double media = 0;
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.printf("Digite a nota %d: ", contador+1);
			valor = entry.nextLine();
			if(!valor.equalsIgnoreCase("sair")) {
				if(Double.parseDouble(valor) <= 10 && Double.parseDouble(valor) >= 0) {
					total += Double.parseDouble(valor);
					contador++;				
				} else {
					System.out.println("Insira uma nota válida.\n");					
				}
			}
		}
		
		media = total / contador;
		
		System.out.printf("As somas das notas no total foi de %.2f, resultante de %d alunos. A média obtida foi: %.2f\n\n", total, contador, media);
		System.out.println("Obrigador por usar.");
		entry.close();
	}
	
	public static void defFor() {
		String valor = "#";
		String controle = "######";
		for(String hash = "#"; !hash.equals(controle); hash += "#" ) {
			System.out.println(hash);
		}
		
	}
	
	public static void defSwitch(){
		String faixa = "preta";
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sou faixa preta, mas passei pelas outras faixas.");
		case "marrom":
			System.out.println("Faixa marrom");
		case "roxa":
			System.out.println("Faixa roxa");
		case "verde":
			System.out.println("Faixa verde");
		case "laranja":
			System.out.println("Faixa laranja");
		case "vermelha":
			System.out.println("Faixa vermelha");
		case "amarela":
			System.out.println("Faixa amarela");
		default:
			System.out.println("No Caratê começamos pela faixa branca.");
		}
	}
	
	public static void main(String[] args) {
//		defWhile();
//		defFor();
		defSwitch();
	}
}
