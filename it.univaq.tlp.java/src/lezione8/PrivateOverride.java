package lezione8;

//: c07:PrivateOverride.java
// Abstract classes and methods.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
 

public class PrivateOverride {
 
  private void f() {
    System.out.println("private f()");
  }
  public static void main(String[] args) {
    PrivateOverride po = new Derived();
    po.f();
     
  }
}

class Derived extends PrivateOverride {
  public void f() {
    System.out.println("public f()");
  }
} ///:~
