package lezione5;


class Point3 {
	   int x = 200;
	   int y = 200;
	   
	   {
	     x = 600;
	     y = 400;
	   }

	   Point3() {
	     System.out.println("Valore di x " + x);
	     System.out.println("Valore di y " + y);
		 x = 300;
	     y = 300;
	     System.out.println("Valore di x " + x);
	     System.out.println("Valore di y " + y);
		 
	     
	   }
	   Point3(int dx, int dy) {
	     this();
	     x = dx;
	     y = dy;
	     
	     System.out.println("Valore di this.x " + this.x);
	     System.out.println("Valore di x in Point3 " + x);
	     System.out.println("Valore di y in Point3 " + y);
		   
	   }

}

public class TestPoint {

	public static void main(String[] args){
		
		Point3 p = new Point3(4,5);
		
		
	}
	
}

