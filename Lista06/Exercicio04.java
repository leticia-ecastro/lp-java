//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite um numero: ");
		int n = entrada.nextInt();
		
		entrada.close();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}

