package lezione11;



class MyException30 extends Exception {}

class Base {
	public void m1() throws MyException30 {}
}

class Derived extends Base {
	//public void m1() throws Exception {}
	public void m1() {}
}


public class ExceptionsInHierarchy {


	public static void main(String args[]) {
		Base b1 = new Base();
		Derived d1 = new Derived();
		
		try {
			b1.m1();
		} catch (MyException30 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d1.m1();
		
	}
	

}
