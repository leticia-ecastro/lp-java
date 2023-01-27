//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		
		int numero, tabuada;
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite um numero: ");
		numero = entrada.nextInt();
		
		while (numero < 1 || numero > 10) {
			System.out.print("Digite um numero no intervalo de 1 a 10: ");
			numero = entrada.nextInt();
		}
		
		for (int i = 0; i <= 10; i++) {
			tabuada = numero * i;
			System.out.println(numero + " x " + i + " = " + tabuada);
		}
		
		
		
	}
}

