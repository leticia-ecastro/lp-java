//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio45 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);

        int quantidadeTermos = 0;
        do {
            System.out.print("Digite a quantidade de termos: ");
            quantidadeTermos = entrada.nextInt();
            if (quantidadeTermos < 1 || quantidadeTermos > 10) {
                System.out.println("Digite uma quantidade de termos entre 1 e 10!");
            }
        } while (quantidadeTermos < 1 || quantidadeTermos > 10);
        
        entrada.close();
        
        int fatorial;
        
        for (int i = quantidadeTermos; i >= 1; i--) {
            fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.printf("%d! = %d\n", i, fatorial);
        }
	}
}
