//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		
		int numero, contadorIntervalo = 0, contadorIntervaloFora = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um numero: ");
			numero = entrada.nextInt();
			
			if (numero >= 10 && numero <= 20) {
				contadorIntervalo++;
			} else {
				contadorIntervaloFora++;
			}
		}
		
		System.out.print("Dentro do intervalo [10,20]: " + contadorIntervalo + " numeros digitados | Fora do intervalo [10,20]: " + contadorIntervaloFora + " numeros digitados");
		
		
	}
}

