//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		int numero = 0, soma;
		
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um numero: ");
			numero += entrada.nextInt(); //numero = numero + entrada;
		}
		
		entrada.close();
		
		System.out.print("Soma total dos numeros digitados: " + numero);
		
		
	}
}

