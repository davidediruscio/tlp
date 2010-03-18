package lezione2;

public class Main {

	public static void main(String[] args){
		Test t1 = new Test();
		Test t2 = new Test();
		
		System.out.println("t1.x" + t1.x);
		System.out.println("t2.x" + t2.x);
		
		Test.x++;
		
		System.out.println("t1.x" + t1.x);
		System.out.println("t2.x" + t2.x);
		
		t1.x++;
		
		System.out.println("t1.x" + t1.x);
		System.out.println("t2.x" + t2.x);
		
		
		t1.stampa(4, 5);
		//Test1.stampa(4,5);
		
	}
}
