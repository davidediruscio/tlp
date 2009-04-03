package lezione6;

class Soup {
	  private Soup() {}
	  // (1) Allow creation via static method:
	   public static Soup makeSoup() {
	    return new Soup();
	  }
	  // (2) Create a static object and return a reference
	  // upon request.(The "Singleton" pattern):
	  private static Soup ps1 = new Soup();
	  public static Soup access() {
		  System.out.println("access() di Soup");
	    return ps1;
	  }
	  public void f() {}
	}

class Sandwich { // Uses Lunch
  void f() { 
	  new Lunch();
	  System.out.println("Sono f() di Sandwich");
  }
}

// Only one public class allowed per file:
public class Lunch {
  void test() {
    // Can't do this! Private constructor:
    //! Soup priv1 = new Soup();
    Soup priv2 = Soup.makeSoup();
    Sandwich f1 = new Sandwich();
    Soup.access().f();
    priv2.access().f();
  }
  
  public static void main(String args[]){
	  Lunch l = new Lunch();
	  l.test();
	  
  }
  
} ///:~
