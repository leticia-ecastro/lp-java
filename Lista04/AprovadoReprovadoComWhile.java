import java.util.Scanner;
import java.util.Random;


public class AprovadoReprovadoComWhile {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int nota;
		
		System.out.print("Digite sua nota: ");
		nota = leia.nextInt();
		
		while (nota <= 0 || nota >= 10) {
			System.out.print("Valor invalido! Digite uma nota valida: ");
			nota = leia.nextInt();
		}
			
		if (nota < 6) {
			System.out.println("Situacao: REPROVADO !");
		} else {
			System.out.println("Situacao: APROVADO !");
		}	
	}
}

