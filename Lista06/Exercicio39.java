//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio39 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
        int quantidadeTermos = 0;
        
        do {
            System.out.print("Digite a quantidade de termos da sequência: ");
            quantidadeTermos = entrada.nextInt();
            if (quantidadeTermos == 0) {
                break;
            }
            if (quantidadeTermos < 0) {
                System.out.println("Digite uma quantidade positiva!");
            }
        } while (quantidadeTermos < 0);
        
        entrada.close();
        
        int numerador = 1, denominador = quantidadeTermos;
        double somaSequencia = 0;
        
        for (int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            somaSequencia += (double) numerador / denominador;
            numerador++;
            denominador--;
        }
        
        System.out.printf("\nSoma da sequência %.5f\n", somaSequencia);
	}
}

