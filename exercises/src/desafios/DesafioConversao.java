package desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário: ");
		String sal1 = entry.next().replace(',', '.');
		
		System.out.println("Digite o segundo salário: ");
		String sal2 = entry.next().replace(',', '.');
		
		System.out.println("Digite o terceiro salário: ");
		String sal3 = entry.next().replace(',', '.');
		
		double somaSalario = Double.parseDouble(sal1) + Double.parseDouble(sal2) + Double.parseDouble(sal3);
		double media = somaSalario / 3;
		
		entry.close();
		System.out.println("Media: " + media + " e soma: " + somaSalario);
	}
}
