package desafios;

import java.util.Scanner;

public class DesafioCapitulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem-vino(a) a calculadora furreca!\nDigite o número 1: ");
		Double num1 = entrada.nextDouble();
		
		System.out.println("Digite o número 2: ");
		Double num2 = entrada.nextDouble();	
		
		System.out.println("Agora o operando: ");
		String op = entrada.next();	 
		
		double res = "+".equals(op) ? num1 + num2 : 0;
		res = "-".equals(op) ? num1 - num2 : res;
		res = "*".equals(op) ? num1 * num2 : res;
		res = "/".equals(op) ? num1 / num2 : res;
		res = "%".equals(op) ? num1 % num2 : res;

		System.out.printf("A conta será: %.2f %s %.2f = %.2f", num1, op, num2, res);
		
		entrada.close(); //Fecha a instancia
;	}
}
