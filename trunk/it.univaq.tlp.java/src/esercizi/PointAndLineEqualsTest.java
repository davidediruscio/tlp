package esercizi;

import static java.lang.Math.sqrt;


class Point5 { 
	int x; int y; 
	Point5(int x1, int y1) { 
		x = x1; 
		y = y1; 
	} 
	double distanceToOrigin() { 
		return sqrt(x * x + y * y); 
	} 
	
	public boolean equals(Point5 a){
	   return (this.x==a.x && this.y==a.y);
	}
		
}

class Line5{ 
	Point5 pt1; 
	Point5 pt2; 
	
	Line5(Point5 p, Point5 q){ 
		pt1 = p; pt2 = q; 
	} 
	
	public boolean equals(Line5 a){
		
		return (this.pt1.equals(a.pt1) && this.pt2.equals(a.pt2));
	}
}


public class PointAndLineEqualsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point5 p1 = new Point5(3,4);
		Point5 p2 = new Point5(3,4);
		Point5 p3 = new Point5(4,5);
		Line5 l1 = new Line5(p1,p3);
		Line5 l2 = new Line5(p1,p3);
		
		
		System.out.println("p1.equals(p2):" +  p1.equals(p2));
		System.out.println("l1.equals(l2):" + l1.equals(l2));

	}

}
