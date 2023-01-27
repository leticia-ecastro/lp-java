//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		int quantidadeAlunos;
		double notasAlunos = 0, media, notas;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		quantidadeAlunos = entrada.nextInt();
		
		for (int i = 1; i <= quantidadeAlunos; i++) {
			System.out.print("Digite a nota do aluno " + i + ": ");
			notasAlunos += entrada.nextDouble();
		}
		
		entrada.close();
		
		media = notasAlunos / quantidadeAlunos;
		
		System.out.printf("Media das notas: %.2f", media);
	}
}

