package classes;

public class AreaCirc {
	double raio;
//	static double pi = 3.14; 
	static final double PI = 3.1415;
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double calcArea(){	
		return PI * Math.pow(raio, 2);
	}
}
