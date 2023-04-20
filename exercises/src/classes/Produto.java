package classes;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;

	Produto() {
		
	}
	
//	Produto(String nomeInicial) {
//		nome = nomeInicial;
//	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	
	double calculaDesconto(double gerente) {
		return preco - (preco * (desconto + gerente));
	}
	
	double calculaDesconto() {
		return preco - (preco * desconto);
	}
}
