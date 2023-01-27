//Letícia Elaine de Castro

public class Exercicio29 {
	
	public static void main (String[] args) {
		
		for (int y = 1; y <= 10; y++) {
			System.out.print(y + ", ");
			if (y % 2 == 0) {
				for (int x = 2; x <= 10; x +=2) {
					System.out.print(x + " ");
				}
			} else {
				for (int x = 1; x <= 10; x +=2) {
					System.out.print(x + " ");
				}
			}
		System.out.println();
		}
		
	}
}

