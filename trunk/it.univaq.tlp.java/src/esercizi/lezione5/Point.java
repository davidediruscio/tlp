package esercizi.lezione5;

public class Point {

	int x;
	int y; 
	Point (int x1, int y1) { 
		x = x1; 
		y = y1; 
	} 
	double distanceToOrigin() { 
		return Math.sqrt(x * x + y * y); 
	}
	
	public boolean equals(Point p1){
		if ((this.x==p1.x) && (this.y==p1.y)){
			return true;
		} 
		return false;
	}
}

