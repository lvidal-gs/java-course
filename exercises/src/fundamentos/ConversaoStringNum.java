package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNum {
	
	public static void numString() {
		Integer num1 = 10000;
		System.out.println(num1);
		System.out.println(num1.toString());
		System.out.println(num1.toString().length());
		
		
		int num2 = 20000;
		System.out.println(Integer.toString(num2));
		System.out.println(Integer.toString(num2).length());
	
		System.out.println("------- GAMBIARRA NUM -> STR ---------");
		System.out.println(("" + num1).length());
		System.out.println(("" + num1).length());
	}
	
	public static void stringNum() {
		String str1 = JOptionPane.
				showInputDialog("Digite um numero: ");
		
		String str2 = JOptionPane.
				showInputDialog("Digite outro numero: ");
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		
		double soma = num1 + num2;
		double media = soma / 2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
			
		
		
	}
	
	
	public static void main(String[] args) {
		numString();
		stringNum();
	}
}
