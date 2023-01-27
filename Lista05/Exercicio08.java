//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		int inicio, termino, duracao;
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a hora que a partida foi iniciada: ");
		inicio = entrada.nextInt();
		
		System.out.print("Digite a hora que a partida foi encerrada: ");
		termino = entrada.nextInt();
		
		entrada.close();
		
		duracao = termino - inicio;
		
		if (duracao <= 0) {
			duracao += 24;
		}
		
		System.out.printf("A partida durou %d horas.", duracao);
	}
}

