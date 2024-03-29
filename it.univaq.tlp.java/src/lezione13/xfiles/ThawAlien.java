package lezione13.xfiles;

//: c12:xfiles:ThawAlien.java
// Try to recover a serialized file without the
// class of object that's stored in that file.
// {ThrowsException}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.io.*;

import lezione13.Alien;


//Prova a cancellare Alien.class prima di eseguire
public class ThawAlien {
  public static void main(String[] args) throws Exception {
    ObjectInputStream in = new ObjectInputStream(
      new FileInputStream(new File("X.file")));
    Alien mystery = (Alien) in.readObject();
    System.out.println(mystery.getClass());
    mystery.method();
  }
} ///:~
