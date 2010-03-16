package lezione1;

public class Polimorfismo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		//Prova a modificare il valore di x
		int x=4;
		Shape s = null;
		if (x<=3) {
			s = new Circle();
		} else {	
			s = new Triangle();
		}
		// La riga seguente provoca un errore
		// a run-time
		//((Circle) s).draw();
		s.draw();
	}

}
