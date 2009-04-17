package lezione8;

class Base {
	static String greeting() { return "Goodnight";}
	String name() { return "Richard";}
}

class Sub extends Base {
	static String greeting() { return "Hello";}
	
	//!static String name() { return "Dick";}
	String name() { return "Dick";}
}

public class OverridingTest {
	public static void main(String[] args) {
		Base b = new Sub();
		System.out.println(b.greeting() + ", " + b.name());
   }
}
