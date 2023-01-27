//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio46 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        
        entrada.close();
        
        int divisores = 0;
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println("O número " + numero + " é primo!");
        } else {
            System.out.println("O número " + numero + " não é primo!");
        }
    }
}

