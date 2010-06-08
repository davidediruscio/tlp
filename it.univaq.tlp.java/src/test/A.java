package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class A {
	
	public A(int i){
		List l1 = new ArrayList();
		List l2 = new LinkedList();
		
		l1 = l2;
	}
	
	public void method(){}
}

class B extends A {
	
	public B(){
		super(6);
		super.method();
	}
	
}
