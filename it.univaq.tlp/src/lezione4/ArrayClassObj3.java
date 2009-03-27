package lezione4;


class Point {
	int x;
	int y;
		
	public Point(int i, int j){
		x=i;
		y=j;
	}
}

public class ArrayClassObj3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point[] points;
		points  = new Point[3];
		
		System.out.println(points[0]);

	}

}
