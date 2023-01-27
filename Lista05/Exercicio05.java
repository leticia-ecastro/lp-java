//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		
		int anoNascimento, anoAtual, idade;
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o ano de seu nascimento: ");
		anoNascimento = entrada.nextInt();
		
		System.out.print("Digite o ano atual: ");
		anoAtual = entrada.nextInt();
		
		entrada.close();
		
		idade = anoAtual - anoNascimento;
		
		if (idade < 16) {
			System.out.print("Voce NAO podera votar na eleicao!");
		} else {
			System.out.print("Voce podera votar na eleicao!");
		}
		
		
	}
}

