package fundamentos;

public class Temperature {
	public static void main(String[] args) {
		final short CONTROL = 32;
		final double DIVISION = 5.0 / 9.0;		
		var farenheit = 86.8; //Inference - auto-declaring a variable type
		
		double result = (farenheit - CONTROL) * DIVISION;
		System.out.println(result + " Celsius degrees");
		
		farenheit = 168;
		result = (farenheit - CONTROL) * DIVISION;
		System.out.println(result + " Celsius degrees");
	}

}
