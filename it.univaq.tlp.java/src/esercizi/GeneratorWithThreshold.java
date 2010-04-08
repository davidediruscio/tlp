package esercizi;

import java.util.Random;

/*
 * Scrivere un programma che generi 25 valori casuali di tipo int. 
 * Per ciascun valore usate un’istruzione if-else per classificarlo 
 * come maggiore, minore o uguale a un secondo valore generato per caso 
 */

public class GeneratorWithThreshold {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random generator = new Random(System.currentTimeMillis()); 
		int threshold = generator.nextInt();
		int number = 0;
		
		for (int i=0; i<25; i++) {
			number = generator.nextInt();
			if (number > threshold) {
				System.out.println("Generato " + number + " > di " + threshold );
			} else if  (number < threshold) {
					System.out.println("Generato " + number + " < di " + threshold );
				} else
					System.out.println("Generato " + number + " = a " + threshold );
		}
		// TODO Auto-generated method stub

		
	}

}
