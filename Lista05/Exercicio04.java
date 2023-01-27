//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		double nota1, nota2, media;
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a nota da primeira avaliacao: ");
		nota1 = entrada.nextDouble();
		
		System.out.print("Digite a nota da segunda avaliacao: ");
		nota2 = entrada.nextDouble();
		
		entrada.close();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.printf("Media = %.1f. APROVADO!", media);
		} else
		{
			System.out.printf("Media = %.1f. REPROVADO!", media);
		}
	}
}

