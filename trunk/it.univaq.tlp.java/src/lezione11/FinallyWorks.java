package lezione11;

class ThreeException extends Exception {}

public class FinallyWorks {
   
  static int count = 0;
  public static void main(String[] args) {
    while(true) {
      try {
        // Post-increment is zero first time:
        if(count++ == 0) {
        	System.out.println("Valore di count " + count);
        	throw new ThreeException();
        }
        System.out.println("No exception");
      } catch(ThreeException e) {
        System.err.println("ThreeException");
      } finally {
        System.err.println("In finally clause");
        if(count == 2) break; // out of "while"
      }
    }
    System.out.println("Sono dopo il while");
    
  }
}
