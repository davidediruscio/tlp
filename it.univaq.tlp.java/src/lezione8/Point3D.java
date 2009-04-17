package lezione8;

 class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class Point3D extends Point {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public static void main(String args[]){
		Point3D p = new Point3D(2,3,4);
	}
}
