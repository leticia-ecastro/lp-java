//Letícia Elaine de Castro

import java.util.Scanner;
import java.util.Random;

public class Saudacao {
	
	public static void main (String[] args) {
		int hora = 0, opcao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Opcoes:\n[1] Digitar a hora\n[2] Gerar hora aleatoriamente\nSelecione a opcao desejada: ");
		opcao = leia.nextInt();
		
		switch (opcao) {
				case 1: 
					do {
						System.out.print("Digite a hora: ");
						hora = leia.nextInt();
						
						if (hora < 0 || hora > 23) {
							System.out.print("Hora invalida !!");
						}
						
					} while (hora < 0 || hora > 23); //enquanto valores inválidos
					leia.close();
					break;
					
				case 2:
					System.out.print("Hora gerada aleatoriamente: ");
					Random horaGerada = new Random();
					hora = horaGerada.nextInt(24); //até 23h
					System.out.println(hora + "h");
					break;
		}
		
		if (opcao == 1 || opcao == 2) {
			if (hora >= 0 && hora <= 6) {
				System.out.print("Zzzzz");
			} else if (hora >= 7 && hora <= 11 ) {
				System.out.print("Bom dia!");
			} else if (hora >= 12 && hora <= 17 ) {
				System.out.print("Boa tarde!");
			} else {
				System.out.print("Boa noite!");
			}
			
		}
		
		
	}
}

