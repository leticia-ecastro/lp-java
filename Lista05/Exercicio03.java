//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main (String[] args) {
		int qtdeMaca;
		double valorTotal;
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a quantidade de macas compradas: ");
		qtdeMaca = entrada.nextInt();
		entrada.close();
		
		if (qtdeMaca < 12) {
			valorTotal = qtdeMaca * 1.3;
			System.out.printf("Valor total da compra: R$%.2f.", valorTotal);
		} else {
			valorTotal = qtdeMaca * 1;
			System.out.printf("Valor total da compra: R$%.2f.", valorTotal);
		}
		
		
	}
}

