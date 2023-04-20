package classes.Desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
		
	void comer(Comida comida) {
		this.peso = this.peso + comida.peso;
	}
	
	void defecar(Comida comida) {
		this.peso = this.peso - comida.peso;
		System.out.println("Fui no banheiro!");
	}
}
