package lezione5;

class Bird {
  int i;
  
  public Bird(){
	  
  }
  public Bird(int i){
	  this.i = i;
  }
}

public class DefaultConstructor {
  public static void main(String[] args) {
    Bird nc = new Bird(5); // Default
    System.out.println(nc.i);
  }
} 
