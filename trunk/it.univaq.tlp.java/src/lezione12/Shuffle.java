package lezione12;

import java.util.*; 

public class Shuffle { 
	public static void main(String args[]) { 
		List l = new ArrayList(); 
		for (int i=0; i<args.length; i++)
			l.add(args[i]);
		Collections.shuffle(l, new Random());
		System.out.println(l); 
	} 
}
