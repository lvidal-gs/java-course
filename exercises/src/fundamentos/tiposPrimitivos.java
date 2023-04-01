package fundamentos;

public class tiposPrimitivos {
	public static void main(String[] args) {
		//Info de funcionario exemplo
		//O Java olha o tipo da variavel, nao seu valor.
		//É possivel separar por underlines para melhor visualizacao
		//O padrao dos inteiros é sempre INT, já o de float é sempre DOUBLE
  		
		//Inteiros -> BSIL
		byte anosEmpresa = 15; // -128 a 127 
		short numeroVendas = 30012; // - 32.768 a 32.767
		int idUsuario = 5_262_899; //-2bi a +2bi alguma coisa
		long faturadoTotal = 6_292_192_129L; // -9bi ate 9bi alguma coisa, o L indica que ele é long
		
		//Reais
		float porcentagemConversao = 35.7F; //é necessario informar que é float com o F, por conta do padrao ser double 
		double faturadoMensal = 2851_12929_01.1;
		
		//Booleans 
		boolean recebeComissao = true; //false -- tudo minusculo
		
		//Caractere
		char status = 'a'; //Aspas simples
		char departamento = '2';
		char unicode = '\u0001';
		//char erro = "";
		//char erro = 'AT';
		
		//Testes
		System.out.println("Dias de empresa: " + (anosEmpresa * 365));	
		System.out.println("Faturamento mensal: " + faturadoMensal);
		
	}
}
