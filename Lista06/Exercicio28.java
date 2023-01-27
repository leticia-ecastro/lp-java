//Letícia Elaine de Castro

public class Exercicio28 {
	
	public static void main (String[] args) {
		
		int auxiliar = 1;
		
		for (int a = 1; a <= 10; a++) {
			System.out.print(a + ", ");
			for (int b = auxiliar + 1; b <= 10; b++) {
				System.out.print(b + " ");
			}
			auxiliar++;
			System.out.println();
		}
		
	}
}

