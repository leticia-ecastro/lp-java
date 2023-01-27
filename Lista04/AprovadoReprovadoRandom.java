//Letícia Elaine de Castro

import java.util.Random;


public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {

	Random nota = new Random();
	
	double notaAleatoria = nota.nextDouble(0, 10);
		
		if (notaAleatoria < 6) {
			System.out.printf("Nota %.0f = REPROVADO!", notaAleatoria);
		} else {
			System.out.printf("Nota %.0f = APROVADO!", notaAleatoria);
		}
	}
}

