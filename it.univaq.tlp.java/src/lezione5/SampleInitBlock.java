package lezione5;


class A1 {
	
	int x=200;
	static int y;
	//A1 a1 = new A1();		// Questo da errore
	
	{						// Blocco di inizializzatore di istanza
		System.out.println("Valore di x nel blocco di inizializzazione "+x);
		x=300;
		
	}
	
	static {				// Il blocco di inizializzatore statico viene eseguito prima di quello di istanza
		y=10;
		System.out.println("Valore di y " + y);
	}
	
	A1(){
		System.out.println("Sono nel costruttore: Valore di x prima "+x);	
		x=400;
		System.out.println("Sono nel costruttore: Valore di x dopo "+x);	
	}
	
}


public class SampleInitBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A1 a1 = new A1();
		
		
		
	}

}
