package arrays_collections;

import java.util.Scanner;

public class DesafioNotas {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas você deseja calcular a média?");
		int qtd = entrada.nextInt();
		double[] notas = new double [qtd];
			
		System.out.println();
		
		for(int i = 0; i < qtd; i++) {
			System.out.printf("Digite a nota %d: \n", i + 1);
			String nota = entrada.next().replace(',', '.');
			notas[i] = Double.parseDouble(nota);
		}
		
		double total = 0;
		
		for(double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.printf("A média dessas %d notas é de: %.2f", qtd, media);
		
		
		
		
	}
	
	
	
}
