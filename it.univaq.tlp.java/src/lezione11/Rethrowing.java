package lezione11;

import java.io.FileNotFoundException;


 
public class Rethrowing {
 
  public static void f() throws FileNotFoundException {
    System.out.println("originating the exception in f()");
    throw new FileNotFoundException("thrown from f()");
  }
  public static void g() throws Exception {
    try {
      f();
    } catch(Exception e) {
      System.err.println("Inside g(),e.printStackTrace()");
      e.printStackTrace();
      throw e;
    }
  }
  public static void main(String[] args)  {
	try {
      g();
      System.out.println("Sono dopo g()");
    } catch(Exception e) {
      System.err.println(
        "Caught in main, e.printStackTrace()");
      e.printStackTrace();
    }
  
  }
}  
