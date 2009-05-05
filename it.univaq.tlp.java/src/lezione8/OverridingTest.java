package lezione8;

class Base {
	static String greeting() { return "Goodnight";}
	//String name() { return "Richard";}			//(1)
	static String name() { return "Richard";}		//(2)
}

class Sub extends Base {
	static String greeting() { return "Hello";}
	
	//!static String name() { return "Dick";}		//(1)
	//String name() { return "Dick";}				//(2)
	static String name() { return "Dick";}	
}
	

public class OverridingTest {
	public static void main(String[] args) {
		Base b = new Sub();
		System.out.println(b.greeting() + ", " + b.name());
		
		Sub s = new Sub();
		System.out.println(s.greeting() + ", " + s.name());
		
		System.out.println(Sub.greeting() + ", " + s.name());
		
		
		
   }
}
