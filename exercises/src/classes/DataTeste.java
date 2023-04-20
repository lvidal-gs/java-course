package classes;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 18;
		d1.mes = 04;
		d1.ano = 2023;
		
		Data d2 = new Data();
		d2.dia = 02;
		d2.mes = 06;
		d2.ano = 2000;
		
//		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		d1.imprimeData();
		d2.imprimeData();
		
		Data d3 = new Data();
		d3.imprimeData();
		
		Data d4 = new Data(29, 10, 1966);
		d4.imprimeData();
	}
	
}
