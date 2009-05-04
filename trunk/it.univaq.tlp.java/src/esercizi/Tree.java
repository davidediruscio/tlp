package esercizi;

abstract class Tree {

  abstract int getSize();
  
  abstract boolean in(String s);
  
  abstract String maxLength();
  

  
}

class Node extends Tree {
  Tree right;
  Tree left;
  
  Node (Tree left, Tree right) {
    this.left = left;
    this.right = right;
  }
  int getSize() {
	    return left.getSize() + right.getSize();

  }
  
  boolean in(String s) {
	  return (left.in(s) || right.in(s));
  }
  
  String maxLength() {
	String s1 = left.maxLength();   
	String s2 = right.maxLength();   
	if (s1.length() <= s2.length())
	  return s2;
	return s1;
  }

}
  
class Leaf extends Tree {
  String s;
  
  Leaf (String s) {
    this.s = s;
  }
  
  int getSize() {
	    return 1;
  }
  
  boolean in(String s){
		 return this.s.equals(s);
  }

  String maxLength(){
	  return s;
  }

  


}

