//Letícia Elaine de Castro

public class Exercicio27 {
	
	public static void main (String[] args) {
		
		int auxiliar = 10; 
		
		for (int y = 1; y <= 10; y++) {
			System.out.print(y + ", ");
			for (int x = 1; x <= auxiliar; x++) {
				System.out.print(x + " ");
			}
			auxiliar--; //a cada giro o auxiliar será decrescido de uma unidade!
			System.out.println();
		}
		
	}
}

