package esercizi;

import java.util.*;


public class CatList {
	private ArrayList cats = new ArrayList();
	
	public void add(Cat c){
		cats.add(c);
	}
	public Cat get(int i){
		return (Cat) cats.get(i);
	}

}
