//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		double salario, valorVendas, comissao, salarioTotal;
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o valor do salario fixo do funcionario: ");
		salario = entrada.nextDouble();
		
		System.out.print("Digite o valor total das vendas efetuadas pelo vendedor: ");
		valorVendas = entrada.nextDouble();
		
		entrada.close();
		
		if (valorVendas <= 1500) {
			comissao = valorVendas * 0.03;
			salarioTotal = salario + comissao;
		} else {
			comissao = valorVendas * 0.03 + (valorVendas - 1500) * 0.05;
			salarioTotal = salario + comissao;
		}
		
		System.out.printf("Salario total: R$%.2f.", salarioTotal);
	}
}

