//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		Scanner novaEntrada = new Scanner (System.in);
		int nota1, nota2;
		double media;
		char resposta;
		
		do {
			do {
				System.out.print("Digite a nota da primeira avaliacao: ");
				nota1 = entrada.nextInt();
			
				if (nota1 < 0 || nota1 > 10) {
				System.out.println("Digite uma nota entre 0 e 10.");
				}
			} while (nota1 < 0 || nota1 > 10);
			
			do {
				System.out.print("Digite a nota da segunda avaliacao: ");
				nota2 = entrada.nextInt();
			
				if (nota2 < 0 || nota2 > 10) {
				System.out.println("Digite uma nota entre 0 e 10.");
				}
			} while (nota2 < 0 || nota2 > 10);
			
			media = (nota1 + nota2) / 2;
			
			System.out.println("A media das notas eh: " + media);
			
			System.out.print("Novo calculo? Digite s = sim | n = nao: ");
			resposta = novaEntrada.nextLine().toLowerCase().charAt(0);
		//nextLine = esvazia o buffer do teclado
		//ToLowerCase = transforma tudo em minúsculo
		//charAt(0) = seleciona o caracter da posição 0 digitada
		
		} while (resposta == 's');
		
			entrada.close();
			novaEntrada.close();
		
		System.out.print("\nFim do programa.");
	}
}

