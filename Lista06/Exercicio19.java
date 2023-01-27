//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		Scanner entradaStr = new Scanner (System.in);
		
		int quantidadeDeMercadoria = 0;
		double valorTotalMercadoria = 0;
		char resposta;
		
		do {
			System.out.print("Digite o valor da mercadoria: ");
			valorTotalMercadoria += entrada.nextDouble(); //irá somar o valor das mercadorias digitadas
			quantidadeDeMercadoria++; //contador de mercadorias
			
			System.out.print("Deseja adicionar mais mercadorias? Digite s = sim | n = nao: ");
			resposta = entradaStr.nextLine().toLowerCase().charAt(0);
		} while (resposta == 's');
		
		System.out.printf("Valor total em estoque: R$%.2f. \n", valorTotalMercadoria);
		
		double media = valorTotalMercadoria / quantidadeDeMercadoria;
		
		System.out.printf("Media de valor das mercadorias: R$%.2f.", media);
	}
}

