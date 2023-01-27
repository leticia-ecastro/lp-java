//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int quantidadeFilhos = 0, acumuladorFilhos = 0, populacao = 0, salarioAbaixoDe150 = 0;
		double salario = 0, acumuladorSalario = 0, maiorSalario = 0;
		
		do {
			System.out.print("Digite o salario: ");
			salario = entrada.nextDouble();
			acumuladorSalario += salario;
			
			if (salario < 0) {
				break;
			}
			
			System.out.print("Digite a quantidade de filhos: ");
			quantidadeFilhos = entrada.nextInt();
			acumuladorFilhos += quantidadeFilhos;
			populacao++;
			
			if (salario < 150) {
				salarioAbaixoDe150++;
			}
			
			if (populacao == 1) {
				maiorSalario = salario;
			}
			
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
		} 
		
		while (true);
		
		entrada.close();
		
		double mediaSalarioPopulacao = acumuladorSalario / populacao;
		double mediaQuantidadeFilhos = (double) quantidadeFilhos / populacao;
		double percentualSalarioAbaixoDe150 = (double) salarioAbaixoDe150 / populacao * 100;
		
		System.out.printf("Media de salario da populacao: R$%.2f", mediaSalarioPopulacao);
		System.out.printf("\nMedia do numero de filhos: %.1f", mediaQuantidadeFilhos);
		System.out.printf("\nMaior salario informado: R$%.2f", maiorSalario);
		System.out.printf("\nPercentual de pessoas com salario inferior a R$150,00: %.2f", percentualSalarioAbaixoDe150);
		
	}
}

