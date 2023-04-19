package fundamentos;

public class BreakContinue {
	private static void usingBreak() {
		for (int i = 0; i < 10 ; i++) {
			if (i == 7)
				break;
			
			System.out.println(i);
		}
		System.out.println("Fim!\n");
	}
	
	private static void usingContinue() {
		for (int i = 0; i < 10 ; i++) {
			if (i == 7)
				continue;

			System.out.println(i);
		}
		System.out.println("Fim!\n");
	}
	
	private static void usingBreakRotulado() {
		externo: for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < 4; j++) {
				if(i == 1)
					break externo;

				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!\n");
	}
	
	private static void usingContinueRotulado() {
		externo: for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < 4; j++) {
				if(i == 1)
					continue externo;

				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!\n");
	}



	public static void main(String[] args) {
		usingBreak();
		usingContinue();
		usingBreakRotulado();
		usingContinueRotulado();
	}
}