package lezione3;

class Point { 
	int x, y; 
}

class ColoredPoint extends Point {
	int color;
	public void setColor(int c) { 
		color = c;
		
	}
}

public class Casting {
	public static void main(String[] args) {
		Point p = new Point();
		ColoredPoint cp = new ColoredPoint();
		cp = (ColoredPoint)p; 		//Errore a run-time
		//Long l = (Long)p; 			//Errore in compilazione
		//int i = (int) p; 			//Errore in compilazione
		
	}
}

