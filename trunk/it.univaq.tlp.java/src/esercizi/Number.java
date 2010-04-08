package esercizi;

public class Number {

	/*
	 * Scrivere un metodo isPerfect che, dato un numero intero, 
	 * verifica se tale numero è perfetto, ovvero se è uguale alla 
	 * somma dei suoi divisori (dove il numero stesso non è incluso 
	 * fra i divisori). Per esempio, 6 è perfetto (6 = 1+2+3).
	 */
	public static boolean isPerfect(int n) {
		int count=0;
		
		for (int i=1; i<n ; i++) {
			if (n%i==0) count=count+i;
		}
		
		return (count==n) ? true : false;
	}
	
	
	/*
	 * Scrivere un metodo isPrime che, dato un numero n intero, 
	 * verifica se tale numero è primo, ovvero se è divisibile solo da 1 
	 * e da n.
	 * Suggerimento: a divide b ( b%a==0) 
	 */
	public static boolean isPrime(int n) {
		for (int i=2; i<n; i++) {
			if (n%i==0) return false;
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Alcuni numeri primi
		 *  	2  	3  	5  	7  	11  	13  	17  	19  	23
		 * 		29 	31 	37 	41 	43 	47 	53 	59 	61 	67
		 *		71 	73 	79 	83 	89 	97 	101 	103 	107 	109
		 *	
		 * Alcuni numeri perfetti
		 *  6 28 496 8128	
		 */		
		int x=28;
		
		System.out.println("Il numero " + x + " e' primo ? " + isPrime(x));
		System.out.println("Il numero " + x + " e' perfetto ? " + isPerfect(x));
		
	}

}

