//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio40 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
        int quantidadeTermos = 0;
        do {
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
            if (quantidadeTermos % 2 != 0) {
                System.out.println("Digite uma quantidade de termos par!");
            }
        } while (quantidadeTermos % 2 != 0);
        
        entrada.close();
        
        int metade = quantidadeTermos / 2, auxiliar = 0;
        
        for (int i = 1; i <= quantidadeTermos; i++) {
            if (i <= metade) {
                System.out.print(i + " ");
                if (i == metade) {
                    auxiliar = i;
                }
            } else {
                System.out.print(auxiliar + " ");
                auxiliar--;
            }
        }
        System.out.println();
	}
}

