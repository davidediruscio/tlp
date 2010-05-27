package lezione12;

import java.util.*;

public class PrintingContainers {

  static Collection fill(Collection c) {
	System.out.println("Aggiunto dog ?" + c.add("dog"));
    System.out.println("Aggiunto dog ?" + c.add("dog"));
    System.out.println("Aggiunto cat ?" +c.add("cat"));
    return c;
  }
  static Map fill(Map m) {
    m.put("dog", "Bosco");
    m.put("dog", "Spot");
    m.put("cat", "Rags");
    return m;
  }
  
  public static void main(String[] args) {
    System.out.println(fill(new ArrayList()));
    System.out.println(fill(new HashSet()));
    System.out.println(fill(new HashMap()));
  }
} 
