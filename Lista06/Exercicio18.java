//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main (String[] args) {
		double valor = 0;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a quantidade de mercadorias no estoque: ");
		int quantidade = entrada.nextInt();
		
		for (int i = 1; i <= quantidade; i++)
		{
			System.out.print("Digite o valor da mercadoria " + i + ": ");
			valor += entrada.nextInt();
		}
		
		double media = valor / quantidade;
		
		
		System.out.printf("Valor total em estoque: %d mercadorias | Media de valor das mercadorias: R$%.2f.", quantidade, media);
	}
}

