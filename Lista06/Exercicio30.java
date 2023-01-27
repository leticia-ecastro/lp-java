//Letícia Elaine de Castro

//o 1º número representa se é par, e a quantidade de elementos pares que serão impressos na frente dele
//o  mesmo ocorre com os ímpares


//i = total de valores que serão impressos

public class Exercicio30 {
	
	public static void main (String[] args) {
		
		int numero; 
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(i + ", "); //imprime o 1º número de cada linha
			
			if (i % 2 == 0) {
				numero = 2; //começa em 1
			} else {
				numero = 1; //começa em 2
			}
			
			//Outro modo:
			//numero = (i % 2 == 0) ? 2 : 1;
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(numero + " ");
				numero += 2; //par + 2 = par;	ímpar + 2 = ímpar
			}
			
			System.out.println();
		}
		
	}
}

