package classes.Desafio;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Lucas", 66.4);
		
		Comida c1 = new Comida("Arroz", 0.4);
		Comida c2 = new Comida("Legumes", 0.1);
		Comida c3 = new Comida("Frango", 0.3);
		

		System.out.printf("Nome: %s -> Peso atual: %.2f\n", p1.nome, p1.peso);
		p1.comer(c3);
		p1.comer(c1);
		p1.comer(c2);
		System.out.printf("Nome: %s -> Peso atual: %.2f\n", p1.nome, p1.peso);
		
		p1.defecar(c3);
		System.out.printf("Nome: %s -> Peso atual: %.2f\n", p1.nome, p1.peso);
	}
}
