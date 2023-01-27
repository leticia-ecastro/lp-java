//Letícia Elaine de Castro

import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		double precoProduto1, precoProduto2;
		
		Scanner produto1 = new Scanner (System.in);
		System.out.print("Digite o preco do produto 1: ");
		precoProduto1 = produto1.nextDouble();
		
		Scanner produto2 = new Scanner (System.in);
		System.out.print("Digite o preco do produto 2: ");
		precoProduto2 = produto2.nextDouble();
		
		
		if (precoProduto1 >= 1 && precoProduto1 <= 1000 && precoProduto2 >= 1 && precoProduto2 <= 1000) {
			if (precoProduto1 > precoProduto2) {
				System.out.printf("O produto 2 (R$%.2f) eh o mais barato", precoProduto2);
			} else if (precoProduto1 < precoProduto2) {
				System.out.printf("O produto 1 (R$%.2f) eh o mais barato", precoProduto1);
			} else {
				System.out.printf("Os precos dos dois produtos sao iguais.");
			}
		} else {
			System.out.println("VALOR INVALIDO!!!");
		}
	}
}

