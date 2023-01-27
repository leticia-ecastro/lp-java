//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int contadorNegativo = 0;
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.print("Insira um numero: ");
			int numero = entrada.nextInt();
			
			if (numero < 0) {
			contadorNegativo++; //contabiliza mais um número negativo digitado!
			}
		}
		
		entrada.close();
		
		System.out.println("Quantidade de numeros negativos digitados pelo usuario: " + contadorNegativo);
		
	}
}

