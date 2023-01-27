//Letícia Elaine de Castro
         
         
import java.util.Random;

public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		 /*Random numeroA = new Random();
		 int novoNumeroA = numeroA.nextInt(1001);
		 
		 Random numeroB = new Random();
		 int novoNumeroB = numeroB.nextInt(21);
		 
		 System.out.printf("A = %d | B = %d\n", novoNumeroA, novoNumeroB);
		 
		 if (novoNumeroA % novoNumeroB == 0) {
			 System.out.println("A eh divisivel por B.");
		 } else {
			System.out.println("A nao eh divisivel por B.");
		 }
		 */
		 
		 int novoNumeroA = (int) (Math.random() * 1001);
		 
		 int novoNumeroB = (int) (Math.random() * 21);
		 System.out.printf("A = %d | B = %d\n", novoNumeroA, novoNumeroB);
		 
		 if (novoNumeroA % novoNumeroB == 0) {
			 System.out.println("A eh divisivel por B.");
		 } else {
			System.out.println("A nao eh divisivel por B.");
		 }
		
		
	
	}
}

