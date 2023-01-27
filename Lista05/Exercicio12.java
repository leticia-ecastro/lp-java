//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		double preco, valorFinal, frete;
		int codigo;
		String regiao;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Codigos nacionais: de 1 a 20 | Codigos internacionais: qualquer outro valor.");
		System.out.print("Digite o codigo do produto: ");
		codigo = entrada.nextInt();
		
		System.out.print("Digite o preco do produto: ");
		preco = entrada.nextDouble();
		
		entrada.close();
		
		switch (codigo)
		{
			case 1:
				frete = preco * 0.1;
				valorFinal = preco + frete;
				regiao = "Norte";
				break;
				
			case 2:
			case 5:
			case 9:
				frete = preco * 0.3;
				valorFinal = preco + frete;
				regiao = "Sul";
				break;
			
			case 3:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				frete = preco * 1.2;
				valorFinal = preco + frete;
				regiao = "Leste";
				break;
			
			case 7:
			case 20:
				frete = preco * 7.3;
				valorFinal = preco + frete;
				regiao = "Oeste";
				break;
			
			default:
				frete = preco * 22.2;
				valorFinal = preco + frete;
				regiao = "Importado";
		}
		
		System.out.printf("Codigo do produto: %d | Preco: %.2f | Procedencia: %s | Frete: %.2f | Valor Final: %.2f", codigo, preco, regiao, frete, valorFinal);
		
		
	}
}

