package desafios;

public class DesafioLogico {
	//T1 e T2 = 50' e svt
	//T1 ou T2 = 32' e svt
	//Nenhum? Sofra
	
	//Usando else/if
	public static void jobs(boolean t1, boolean t2) {
		if (t1 && t2) 
			System.out.print("Compra a TV de 50'");
		
		else if (t1 ^ t2)
			System.out.print("Compra a TV de 32'");
		
		else
			System.out.print("Compra nada, mermão.");
		
		String resSorvete = t1 || t2 ? " e mais o sorvete!" : " E ainda fica sem sorvete.";
		System.out.print(resSorvete);
	}
	
	public static void main(String[] args) {
//		jobs(false, true);
		
		boolean t1 = false;
		boolean t2 = false;
		boolean sorvete = t1 || t2;
		
		boolean buy50 = t1 && t2;
		boolean buy32 = t1 ^ t2;
		
		boolean semNada = !(sorvete);
		
		System.out.println("Comprou a de 50'?" + buy50);
		System.out.println("Comprou a de 32'?" + buy32);
		System.out.println("Ganhou sorvete? " + sorvete);
		System.out.println("Está mais saudavel? " + semNada);
		
	}
}
