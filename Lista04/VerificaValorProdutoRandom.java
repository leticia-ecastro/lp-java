//Letícia Elaine de Castro

import java.util.Random;

public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		Random produto1 = new Random();
		double precoProduto1 = produto1.nextDouble(1, 1000);
		
		Random produto2 = new Random();
		double precoProduto2 = produto2.nextDouble(1, 1000);
		
		System.out.printf("Produto 1: R$%.2f | Produto 2: R$%.2f\n\n", precoProduto1, precoProduto2);
		
		if (precoProduto1 < precoProduto2) {
			System.out.printf("O produto 1 (R$%.2f) é o mais barato.", precoProduto1);
		} else if (precoProduto1 > precoProduto2) {
			System.out.printf("O produto 2 (R$%.2f) é o mais barato.", precoProduto2);
		} else {
			System.out.printf("O preço dos dois produtos são iguais (R$%.2f).", precoProduto1);
		}
		
	}
}

