package arrays_collections;

import java.util.Arrays;

public class Introducao {

	
	
	
	public static void main(String[] args) {
		String[] nome = new String[1];
		double notas[] = new double[4];
		notas[0] = 4.3;
		notas[2] = 5.6;
		notas[3] = 9.3;
		notas[1] = 7;
		
		System.out.println(Arrays.toString(notas));
		
		double total = 0;
		for(int i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		double media = total / notas.length;
		
		System.out.printf("Media: %.2f\n", media);
		
		String[] animais = {"Papagaio", "Leão", "Cachorro", "Gato"};
		System.out.println(animais.length);
		
	
	}
}
