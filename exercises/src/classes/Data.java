package classes;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String formataData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimeData() {
		System.out.println(formataData());
	}
}
