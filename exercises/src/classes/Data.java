package classes;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data () {
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
//	Data(int nDia, int nMes, int nAno){
//		dia = nDia;
//		mes = nMes;
//		ano = nAno;
//	}
	
	Data(int nDia, int nMes, int ano){
		this.dia = nDia;
		this.mes = nMes;
		this.ano = ano;
	}
	
	
	String formataData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimeData() {
		System.out.println(formataData());
	}
}
