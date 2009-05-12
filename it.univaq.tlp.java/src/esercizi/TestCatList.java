package esercizi;

import java.util.*;

import lezione12.Dog;

public class TestCatList {
/**
	 * @param args
	 */
	public static void main(String[] args) {
		CatList cats = new CatList();
		
		for(int i = 0; i < 7; i++)
		   cats.add(new Cat(i));
		
		//!cats.add(new Dog(i));
		
	}

}
