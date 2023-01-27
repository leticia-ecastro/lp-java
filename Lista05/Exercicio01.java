//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		int valor;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		valor = entrada.nextInt();
		entrada.close();
		
		if (valor > 10) {
			System.out.print("O valor digitado eh maior que 10!");
		} else {
			System.out.print("O valor digitado nao eh maior que 10!");
		}
		
		
		
		
	}
}

