//Letícia Elaine de Castro

import java.util.Random;

public class ExibeNumeroAleatorio {
	
	public static void main (String[] args) {
		
		Random numero = new Random();
		
		double numeroAleatorio = numero.nextDouble(0, 100);
		
		System.out.printf("Numero gerado de forma aleatoria: %.0f", numeroAleatorio);
		
	}
}

