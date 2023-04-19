package desafios;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		double c1 =	Math.pow(6*(3+2),2) / (3 * 2) ;
		double c2 = Math.pow((1 - 5) * (2 - 7) / 2, 2);		
		double c3 = Math.pow(c1 - c2, 3);
		double c4 = c3 / Math.pow(10, 3);
		
		int c4Int = (int) c4;
		
		System.out.println("Resultado c1: " + c1);
		System.out.print("\nResultado c2: " + c2);
		System.out.print("\nResultado c3: " + c3);
		System.out.print("\nResultado c4: " + c4Int);
		
	}
	
}
