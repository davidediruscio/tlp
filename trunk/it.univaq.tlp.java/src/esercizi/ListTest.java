package esercizi;



abstract class List {
   abstract boolean in(int i);
   abstract boolean sorted();
   abstract boolean sorted(int i);
   static List makeEmpty() {
    return new Nil();
  }
   abstract List copy();
   abstract List add(int i) ;
}

class Nil extends List{
  Nil() {}
   boolean in(int i) {
    return false;
  }
   boolean sorted() {
    return true;
  }
  boolean sorted(int i) {
    return true;
  }
  List copy() {
    return this;
  }
  List add(int i)  {
    return new Cons(i, this);
  }
}

class Cons extends List {
  int hd;
  List tl;
  Cons(int hd, List tl) {
    this.hd = hd;
    this.tl = tl;
  }
   boolean in(int i) {
    if (hd == i) {
      return true;
    }else{
      return tl.in(i);
    }
  }
   boolean sorted() {
    return tl.sorted(hd);
  }
  boolean sorted(int i) {
    if (i < hd) {
      return tl.sorted(hd);
    }else{
      return false;
    }
  }
  List copy() {
    return new Cons(hd, tl.copy());
  }
  	
  List add(int i) {
	if (i < hd) {
      return new Cons(i, copy());
    }else if (i == hd) {
       return copy();
    }else {
      return new Cons(hd, tl.add(i));
    }
  }
}


public class ListTest {
	
	public static void main(String[] args) {
		List l = new Cons(1, new Cons(3, new Nil()));
		System.out.println(l.sorted());
		l.add(2);

	}
	
}



