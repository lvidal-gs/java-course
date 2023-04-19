package classes;

public class ProdutoTestes {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Monitor LG 29'");		
//		p1.nome = "Monitor LG 29'";
		p1.preco = 1200.00;
		p1.desconto = 0.09;
		
		var p2 = new Produto("Teclado Womier K66");
//		p2.nome = "Teclado Womier K66";
		p2.preco = 430.00;
		p2.desconto = 0.12;
		
		System.out.println(p1.nome);
		
		System.out.println(p1.calculaDesconto());
		System.out.println("Com desconto do gerente: R$" + p1.calculaDesconto(0.05));
		
		double descontado = p2.calculaDesconto();
		double descontado2 = p2.calculaDesconto(0.1);
		System.out.println(descontado);
		System.out.println("Com desconto do gerente: R$" + descontado2);
		
	}
	
	
}
