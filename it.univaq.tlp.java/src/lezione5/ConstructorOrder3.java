package lezione5;

class A3 {
	
	public A3(int i) {
		System.out.println("Sono il costruttore di A3");
	}
}

class B3 extends A3 {
	{
		
		System.out.println("Sono l'inizializzatore di istanza di B3");
		
	}
	
	public B3() {
		super(5);
		System.out.println("Sono il costruttore di B3");
	}
	
	public B3(int i) {
		this();
		System.out.println("Sono il costruttore di B3(int)");
	}
}

public class ConstructorOrder3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B3 b = new B3(5);
		// TODO Auto-generated method stub

	}

}