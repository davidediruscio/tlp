package esercizi.equals;

import static java.lang.Math.sqrt;
import lezione8.PhoneNumber;

class Point { 
	private int x; 
	private int y;
	
	Point(int x1, int y1) { 
		x = x1; 
		y = y1; 
	} 
	double distanceToOrigin() { 
		return sqrt(x * x + y * y); 
	} 
	
	public boolean equals(Object obj) {
		if (obj == this) return true;
		 if (!(obj instanceof Point)) return false;
	     Point p = (Point) obj;
	     return this.x == p.x && this.y == p.y;	
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}

class Line{ 
	private Point pt1; 
	private Point pt2; 
	
	Line(Point p, Point q){ 
		pt1 = p; pt2 = q; 
	} 
	
	public boolean equals(Object obj) {
		if (obj == this) return true;
		 if (!(obj instanceof Line)) return false;
	     Line l = (Line) obj;
	     return this.pt1.equals(l.pt1) && this.pt2.equals(l.pt2);	
	}
	
	public Point getStartPoint(){
		return pt1;
	}
	
	public Point getEndPoint(){
		return pt2;
	}
}

public class TestEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point pt1 = new Point(5,4);
		Point pt2 = new Point(7,4);
		Point pt3 = new Point(7,9);
		Point pt4 = new Point(7,9);
		
		Line l1 = new Line(pt1,pt2);
		Line l2 = new Line(pt2,pt3);
		Line l3 = new Line(pt2,pt3);
		Line l4 = new Line(pt2,pt4);
		
		System.out.println("pt1.equals(pt2): " + pt1.equals(pt2));
		System.out.println("pt3.equals(pt4): " + pt3.equals(pt4));
		
		System.out.println("l1.equals(l2): " + l1.equals(l2));
		System.out.println("l2.equals(l3): " + l2.equals(l3));
		System.out.println("l2.equals(l4): " + l2.equals(l4));
		
		System.out.println("l2.equals(pt1): " + l2.equals(pt1));
		
	
	}
	

}
