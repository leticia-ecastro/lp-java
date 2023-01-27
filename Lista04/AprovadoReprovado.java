//Letícia Elaine de Castro

import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int nota;
		
		System.out.print("Digite sua nota: ");
		nota = leia.nextInt();
		
		if (nota >= 0 && nota <= 10) {
			if (nota < 6) {
				System.out.println("REPROVADO !");
			} else {
				System.out.println("APROVADO !");
			}
		} else {
			System.out.println("Valor invalido !");
		}
	}
}

