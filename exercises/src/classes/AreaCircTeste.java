package classes;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		AreaCirc c1 = new AreaCirc(5.6);
		AreaCirc c2 = new AreaCirc(10);
		var c3 = new AreaCirc(5);
		
//		AreaCirc.PI = 3.1415;
		
		System.out.println(c1.calcArea());
		System.out.println(c2.calcArea());
		System.out.println(c3.calcArea());
	}
	
}
