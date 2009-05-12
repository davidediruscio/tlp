package lezione12;

import java.util.*;

public class CatsAndDogs {
  public static void main(String[] args) {
    List cats = new ArrayList();
    for(int i = 0; i < 7; i++)
      cats.add(new Dog(i));
    
    // Not a problem to add a dog to cats:
    cats.add(new Cat(7));
    
    for(int i = 0; i < cats.size(); i++)
      ((Dog)cats.get(i)).id();
      // Dog is detected only at run time
  }
} ///:~
