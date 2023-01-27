//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		double horasTrabalhadas, valorHora, horasExtras, salarioNormal, salarioAdicional, salarioTotal;
		
		//horasTrabalhadas = quantidade de horas trabalhadas no mês
		//horasExtras = quantidade de horas extras no mês
		//valorHora = valor da hora tradicional
		//salarioNormal = salário pago pelo mês trabalhado
		//salarioAdicional = salário pago pelas horas extras trabalhadas (quantidade de horasExtras * valor da hora extra)
		//salarioTotal = salarioNormal + salarioAdicional
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a quantidade de horas trabalhadas no mes: ");
		horasTrabalhadas = entrada.nextInt();
		
		System.out.print("Digite o valor pago por hora trabalhada: ");
		valorHora = entrada.nextInt();
		
		entrada.close();
		
		horasExtras = horasTrabalhadas - 120; //120 = horas trabalhadas no mês para gerar um salario padrao
		salarioNormal = (horasTrabalhadas - horasExtras) * valorHora;
		salarioAdicional = horasExtras * (valorHora + valorHora * 0.5); //hora extra = valor da hora normal + 50% dessde valor
		salarioTotal = salarioAdicional + salarioNormal;
		
		System.out.printf("Salario total do funcionario: R$%.2f.", salarioTotal);
		
		
	}
}

