package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		
		int r = 3;
		final double PI = 3.14159;  //Final defines that the variable will be a constant

		double circunference = 2 * PI * r;
		
		System.out.println(circunference);
		
		double area = PI * (circunference*2) / 4;
		System.out.println(area);
	}
}
