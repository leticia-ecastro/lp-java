//Letícia Elaine de Castro

import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		int valorA, valorB;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o valor de A: ");
		valorA = leia.nextInt();
		
		System.out.print("Digite o valor de B: ");
		valorB = leia.nextInt();
		//leia.close();
		
		while (valorA < 1 || valorA > 1000) {
			System.out.print("O valor de A eh invalido! Digite um valor valido e diferente de zero: ");
			valorA = leia.nextInt();
		}
		
		while (valorB < 1 || valorB > 20) {
			System.out.print("O valor de B eh invalido! Digite um valor valido e diferente de zero: ");
			valorB = leia.nextInt();
		}
		
		if (valorA % valorB == 0) {
			System.out.println("A eh divisivel por B");
		} else {
			System.out.println("A NAO eh divisivel por B");
		}
	}
}
		
	


