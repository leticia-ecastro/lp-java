//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main (String[] args) {
		
		int soma = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ") Digite um numero: ");
			int numero = entrada.nextInt();
			
			if (numero < 40) {
				soma += numero;
			}
		}
		
		System.out.print("Soma dos numeros menores que 40: " + soma);
		
		
	}
}

