package classes;

public class Produto {
	String nome;
	double preco;
	double desconto;

	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto() {
		
	}
	
	double calculaDesconto(double gerente) {
		return preco - (preco * (desconto + gerente));
	}
	
	double calculaDesconto() {
		return preco - (preco * desconto);
	}
}
