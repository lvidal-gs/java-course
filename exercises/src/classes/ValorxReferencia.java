package classes;

public class ValorxReferencia {
	
	public static void main(String[] args) {
		double a = 2;
		double b = a; //Atribuição por valor		
		a++;
		b--;
	
		System.out.println(a + " " + b);
		
		Data d1 = new Data(2, 6, 2000);
		Data d2 = d1; //Atribuição por referência
		
		d2.dia = 29;
		d1.mes = 10;
		d2.ano = 1966;
		
		System.out.println(d2.formataData());
		System.out.println(d1.formataData());	
		
		voltaDataPadrao(d2);
		
		System.out.println(d2.formataData());
		System.out.println(d1.formataData());	
		
		int c = 10;
		System.out.println(alteraPrimitivo(c));
		System.out.println(c);
		
	}
	
	static void voltaDataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static int alteraPrimitivo(int a) {
		return a + 5;
	}
	
	
	
}
