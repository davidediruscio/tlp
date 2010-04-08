package lezione5;

class C {

	public C() {
		
	}
	public C(int i) {
		System.out.println("Sono il costruttore di C con parametro " + i);
		
	}
}

class A extends C {
	
	public A() {
		System.out.println("Sono il costruttore di A");
	}
	
}

class B extends A {
	
	public B() {
		System.out.println("Sono il costruttore di B");
	}
	
	
	public B(int i) {
		this();
		System.out.println("Sono il costruttore di B(int)");
	}
}

public class ConstructorOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B b = new B(5);
		// TODO Auto-generated method stub

	}

}
