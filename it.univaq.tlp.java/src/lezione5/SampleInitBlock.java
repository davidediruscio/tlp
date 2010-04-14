package lezione5;


class A1 {
	
	int x=200;
	//A1 a1 = new A1();
	
	{
		System.out.println("Valore di x "+x);
		x=300;
		
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
