package fundamentos;

public class ConversaoPrimitivo {
	public static void main(String[] args) {
		int a = 2;
		System.out.println(a);
		
		
		double b = 1.19289278128928281829; //Implicita
		System.out.println(b);
		
		float c = (float) 1.2237123781288; //Explicita (CAST)
		System.out.println(c);
		
		double d = (double) c;
		System.out.println(d);
		
		float e = (float) d;
		System.out.println(e);
		
	}	
}
